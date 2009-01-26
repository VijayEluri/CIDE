package de.ovgu.cide.features.source;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cide.gast.ASTWrappers;
import cide.gast.IASTNode;
import de.ovgu.cide.ASTColorChangedEvent;
import de.ovgu.cide.CIDECorePlugin;
import de.ovgu.cide.af.Alternative;
import de.ovgu.cide.features.IFeature;

public class SourceFileColorManager extends AbstractColorManager {

	private final DirectoryColorManager directoryColorManager;
	private final ColoredSourceFile source;
	
	private Map<String, List<String>> id2parentIDs;

	public SourceFileColorManager(IStorageProvider storageProvider,
			ColoredSourceFile source,
			DirectoryColorManager directoryColorManager) {
		super(storageProvider, source.getResource().getProject(), source
				.getResource(), source.getFeatureModel());
		this.directoryColorManager = directoryColorManager;
		this.source = source;
		
		id2parentIDs = new HashMap<String, List<String>>();
	}
	
	@Override
	protected Map<String, List<String>> getID2parentIDs() {
		return id2parentIDs;
	}

	public Set<IFeature> getOwnColors(IASTNode node) {
		return super.getOwnColors(node.getId());
	}

	public boolean addColor(IASTNode node, IFeature color) {
		if (node == null)
			return false;
		updateID2parentIDs(node);
		
		return super.addColor(node.getId(), color);
	}
	
	public boolean toggleColor(List<IASTNode> nodes, IFeature color, boolean addColor) {
		if ((nodes == null) || (nodes.isEmpty()))
			return false;
		
		boolean result = true;
		this.beginBatch();
		for (IASTNode node : nodes) {
			result &= addColor ? addColor(node, color) : removeColor(node, color);
		}
		this.endBatch();
		
		CIDECorePlugin.getDefault().notifyListeners(new ASTColorChangedEvent(this, nodes, source));
		return result;
	}

	public boolean removeColor(IASTNode node, IFeature color) {
		if (node == null)
			return false;
		
		return super.removeColor(node.getId(), color);
	}

	public boolean hasColor(IASTNode node, IFeature color) {
		return super.hasColor(node.getId(), color);
	}
	
	public boolean activateAlternative(Alternative alternative, String oldText) {
		return super.activateAlternative(alternative, oldText);
	}
	
	public boolean createAlternative(IASTNode node, String altID) {
		if (node == null)
			return false;
		
		updateID2parentIDs(node);
		return super.createAlternative(new Alternative(altID, node.getId(), id2parentIDs.get(node.getId()), null), node.render().trim());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coloredide.features.source.ISourceFileColorProvider#getColors(cide.gast
	 * .IASTNode)
	 */
	public Set<IFeature> getColors(IASTNode node) {
		Set<IFeature> result = new HashSet<IFeature>();
		result.addAll(getOwnColors(node));
		result.addAll(getInheritedColors(node));
		return Collections.unmodifiableSet(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coloredide.features.source.ISourceFileColorProvider#getInheritedColors
	 * (cide.gast.IASTNode)
	 */
	public Set<IFeature> getInheritedColors(IASTNode node) {
		Set<IFeature> result = new HashSet<IFeature>();

		IASTNode parent = node.getParent();
		if (parent != null) {
			if (parent.isOptional())
				if (ASTWrappers.inheritsColors(parent, node))
					result.addAll(getOwnColors(parent));
			result.addAll(getInheritedColors(parent));
		}
		result.addAll(directoryColorManager.getColors(source.getResource()));

		return Collections.unmodifiableSet(result);
	}

	public boolean clearColor(IASTNode node) {
		return super.clearColor(node.getId());
	}

	public void setColors(IASTNode node, Set<IFeature> newColors) {
		updateID2parentIDs(node);
		super.setColors(node.getId(), newColors);
	}

	public DirectoryColorManager getDirectoryColorManager() {
		return directoryColorManager;
	}
	
	private void updateID2parentIDs(IASTNode node) {
		if (node == null)
			return;
		
		LinkedList<String> parentIDs = new LinkedList<String>();
		IASTNode parentNode = node;
		while ((parentNode = parentNode.getParent()) != null) {
			if ((parentNode.getId() != null) && (parentNode.getId().length() > 0))
				parentIDs.addFirst(parentNode.getId());
		}
		id2parentIDs.put(node.getId(), parentIDs);
	}
}
