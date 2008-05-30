package coloredide.validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;

import cide.gast.ASTNode;
import cide.greferences.IValidationErrorCallback;
import cide.greferences.IValidationRule;
import coloredide.features.source.ColoredSourceFile;

public class DefaultErrorCreator implements IValidationErrorCallback {

	private final ColorProblemFactory problemFactory = new ColorProblemFactory();

	protected static class ColorProblemFactory {
		public ColorProblem createError(ASTNode node, String message,
				IValidationRule brokenRule) {
			return createError(node, message, node.getStartPosition(), node
					.getStartPosition()
					+ node.getLength(), brokenRule);
		}

		public ColorProblem createError(ASTNode node, String message,
				int startPosition, int endPosition, IValidationRule brokenRule) {
			return createProblem(ColoredSourceFile.getResource(node), message,/* IProblem.ExternalProblemNotFixable, */
			IMarker.SEVERITY_ERROR, startPosition, endPosition, 0, 0,
					brokenRule, node.getId());
		}

		public ColorProblem createError(IResource resource, String message,
				int startPosition, int endPosition, int line, int column,
				IValidationRule brokenRule, String nodeID) {
			return createProblem(resource, message,
			/* IProblem.ExternalProblemNotFixable, */brokenRule
					.getErrorSeverity(), startPosition, endPosition, line,
					column, brokenRule, nodeID);
		}

		public ColorProblem createProblem(IResource resource, String message,
				int severity, int startPosition, int endPosition, int line,
				int column, IValidationRule brokenRule, String nodeID) {
			return new ColorProblem(resource, message, severity, startPosition,
					endPosition, line, column, brokenRule, nodeID);
		}
	}

	protected final List<ColorProblem> problems = new ArrayList<ColorProblem>();

	// public void errorCallMustHaveDeclarationColor(ASTNode call,
	// Set<Feature> callColors, IMethodBinding decl,
	// Set<Feature> declColors) {
	//
	// String message = "Method/Constructor Call and Declaration colors do not
	// match ("
	// + decl.getName()
	// + "; "
	// + callColors
	// + " vs "
	// + declColors
	// + ")";
	//
	// problems.add(problemFactory.createError(call, message,
	// ColorProblem.METHODCALL));
	// }
	//
	// public void errorVariableAccessMustHaveDeclarationColor(ASTNode
	// varAccess,
	// Set<Feature> callColors, IVariableBinding decl,
	// Set<Feature> declColors) {
	//
	// String message = "Variable/Field Access and Declaration colors do not
	// match ("
	// + decl.getName()
	// + "; "
	// + callColors
	// + " vs "
	// + declColors
	// + ")";
	//
	// problems.add(problemFactory.createError(varAccess, message,
	// ColorProblem.FIELDACCESS));
	// }
	//
	// public void nodeMustHaveParentsColor(ASTNode node, Set<Feature>
	// declColors,
	// ASTNode parent) {
	// String message = "Invalid coloring: must have parents color ("
	// + declColors + ")";
	//
	// problems.add(problemFactory.createError(node, message));
	// }
	//
	// public void warningCannotResolveBinding(ASTNode node) {
	// String message = "Cannot resolve binding";
	// problems.add(problemFactory.createError(node, message));
	// }
	//
	// public void errorCallParamMustHaveDeclarationColor(Expression param,
	// Set<Feature> declColors, String note) {
	//
	// String message = "Parameter must have declared colors (" + declColors
	// + ") " + note;
	//
	// problems.add(problemFactory.createError(param, message));
	// }
	//
	// public void errorTypeRefMustHaveTypeColor(ASTNode node,
	// Set<Feature> typeColors) {
	// String message = "Type reference must have Type colors (" + typeColors
	// + ")";
	//
	// problems.add(problemFactory.createError(node, message,
	// ColorProblem.TYPE));
	// }
	//
	// public void errorImportMustHaveTargetColor(ImportDeclaration node,
	// Set<Feature> typeColors) {
	// String message = "Import must have target colors (" + typeColors + ")";
	//
	// problems.add(problemFactory.createError(node, message,
	// ColorProblem.IMPORT));
	// }
	//
	// public void errorImportedTypeMustHaveImportColor(ASTNode type,
	// Set<Feature> typeColors, Set<Feature> importColors) {
	// String message = "Imported Type must have Import colors ("
	// + importColors + ")";
	//
	// problems.add(problemFactory.createError(type, message));
	// }
	public void validationError(ASTNode node, IValidationRule brokenRule) {
		problems.add(problemFactory.createError(node, brokenRule
				.getErrorMessage(), brokenRule));
	}

}
