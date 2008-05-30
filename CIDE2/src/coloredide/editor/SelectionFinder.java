/**
 * 
 */
package coloredide.editor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;

import cide.gast.ASTNode;
import cide.gast.ASTVisitor;
import coloredide.features.ASTColorInheritance;

class SelectionFinder extends ASTVisitor {

	private final List<ASTNode> selectedNodes;

	private final Set<ASTNode> knownNodes = new HashSet<ASTNode>();

	private final int offset;

	private final int length;

	private final boolean optionalOnly;

	public SelectionFinder(List<ASTNode> selectedNodes,
			ITextSelection selection, boolean optionalOnly) {
		this.selectedNodes = selectedNodes;
		this.offset = selection.getOffset();
		this.length = selection.getLength();
		this.optionalOnly = optionalOnly;
	}

	public SelectionFinder(List<ASTNode> selectedNodes, IRegion region,
			boolean optionalOnly) {
		this.selectedNodes = selectedNodes;
		this.offset = region.getOffset();
		this.length = region.getLength();
		this.optionalOnly = optionalOnly;
	}

	@Override
	public boolean visit(ASTNode node) {
		boolean r = super.visit(node);
		if (node.getStartPosition() >= offset
				&& (node.getStartPosition() + node.getLength()) <= (offset + length)) {

			if (node.isOptional()) {
				boolean hasColoredParent = selectedNodes.contains(node
						.getParent());
				boolean hasKnownParent = knownNodes.contains(node.getParent());
				boolean noInherit = !ASTColorInheritance.inheritsColors(node
						.getParent(), node);
				if (!hasKnownParent || (noInherit && hasColoredParent)) {
					selectedNodes.add(node);
				}
			}
			knownNodes.add(node);

		}
		return r;
	}
}