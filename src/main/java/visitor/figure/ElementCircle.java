package visitor.figure;

public class ElementCircle implements Element {

	private String attributeCircle;

	public ElementCircle() {
		this.setAttributeA("C");
	}

	public String getAttributeCircle() {
		return this.attributeCircle;
	}

	public void setAttributeA(String attributeA) {
		this.attributeCircle = attributeA;
	}

	@Override
	public void accept(Figure v) {
		v.visitElementCircle(this);
	}
}
