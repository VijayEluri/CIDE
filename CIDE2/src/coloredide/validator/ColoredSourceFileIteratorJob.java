package coloredide.validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;

import cide.gast.ISourceFile;

import coloredide.CIDECorePlugin;
import coloredide.features.source.ColoredSourceFile;

public abstract class ColoredSourceFileIteratorJob extends WorkspaceJob {

	protected final IProject[] projects;

	private String jobPrefix;

	private String jobDescription;

	protected boolean colorCacheUpdate = true;

	public ColoredSourceFileIteratorJob(IProject[] projects,
			String jobDescription, String jobPrefix) {
		super(jobDescription);
		this.jobDescription = jobDescription;
		this.jobPrefix = jobPrefix;
		this.projects = projects;
	}

	public ColoredSourceFileIteratorJob(IProject project,
			String jobDescription, String jobPrefix) {
		this(new IProject[] { project }, jobDescription, jobPrefix);
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {
		List<IProject> projects = new ArrayList<IProject>();
		for (IProject project : this.projects) {
			if (project.exists() && project.isOpen())
				projects.add(project);
		}

		monitor.beginTask(jobDescription, projects.size());

		for (IProject project : projects) {
			processProject(project, new SubProgressMonitor(monitor, 1));
		}

		finish();

		monitor.done();
		if (monitor.isCanceled())
			return Status.CANCEL_STATUS;
		return Status.OK_STATUS;
	}

	protected void finish() {
	}

	private void processProject(IProject project, IProgressMonitor monitor)
			throws CoreException {
		if (monitor.isCanceled())
			return;

		monitor.beginTask(jobPrefix + " " + project.getProject().getName(),
				countColoredFiles(project));
		monitor.subTask(jobPrefix + " " + project.getProject().getName());
		cleanProject(project, monitor);

		processContainer(project, monitor);

		monitor.done();
	}

	private void processContainer(IContainer container, IProgressMonitor monitor)
			throws CoreException {
		if (monitor.isCanceled())
			return;

		for (IResource resource : container.members()) {
			if (resource instanceof IContainer)
				processContainer((IContainer) resource, monitor);
			if (resource instanceof IFile)
				processSourceFile((IFile) resource, monitor);
		}
	}

	private void processSourceFile(IFile file, IProgressMonitor monitor)
			throws CoreException {
		if (monitor.isCanceled())
			return;
		if ("color".equals(file.getFileExtension()))
			return;

		ColoredSourceFile source = ColoredSourceFile.getColoredSourceFile(file);
		if (!source.isColored())
			return;

		monitor.subTask(jobPrefix + " " + file.getName());

//		ISourceFile ast = source.getAST();
		// ColoredIDEPlugin.getDefault().colorCache.updateASTColors(project,
		// ast,
		// source.getColorManager());
		processSource(source);
		monitor.worked(1);
	}

	protected abstract void processSource(ColoredSourceFile source)
			throws CoreException;

	protected void cleanProject(IProject project, IProgressMonitor monitor)
			throws CoreException {
	}

	private int countColoredFiles(IContainer container) throws CoreException {
		int result = 0;
		for (IResource resource : container.members()) {
			if (resource instanceof IContainer)
				countColoredFiles((IContainer) resource);
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				if ("color".equals(file.getFileExtension()))
					continue;

				ColoredSourceFile source = ColoredSourceFile
						.getColoredSourceFile(file);
				if (source.isColored())
					result++;
			}

		}
		return result;
	}

}