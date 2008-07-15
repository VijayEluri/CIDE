package cide.gast;

public class PropertyWrapper<T extends IASTNode, TWrappee extends IASTNode>
		extends Property {

	protected T value;
	private String wrappeeProperty;
	private boolean isRemoved = false;

	public PropertyWrapper(String name, T value, String wrappeeProperty) {
		super(name, PropertyType.ONE);
		this.value = value;
		this.wrappeeProperty = wrappeeProperty;
		this.isRemoved = false;
	}

	public IASTNode getValue() {
		if (!isRemoved)
			return value;
		else
			return getWrappee();
	}

	public TWrappee getWrappee() {
		return ((PropertyOne<TWrappee>) value.getProperty(wrappeeProperty))
				.getValue();
	}

	public void setValue(T value) {
		if (value != null) {
			this.value = value;
			this.isRemoved = false;
			notifyChange();
		}
	}

	public boolean canRemoveSubtree(IASTNode node) {
		return !isRemoved;
	}

	public void removeSubtree(IASTNode node) {
		if (node == value) {
			isRemoved = true;
			notifyChange();
		}
	}

	void setParent(IASTNode parent) {
		super.setParent(parent);
		value.setParent(parent, this);
	}

	Property deepCopy() {
		return new PropertyWrapper<T, TWrappee>(new String(name), (T) value
				.deepCopy(), new String(wrappeeProperty));
	}

	public IASTNode[] getChildren() {
		return new IASTNode[] { getValue() };
	}

	public boolean isWrapper() {
		return true;
	}

}
