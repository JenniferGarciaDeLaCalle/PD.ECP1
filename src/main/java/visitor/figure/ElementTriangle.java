package visitor.figure;

public class ElementTriangle implements Element {

	private String attributeTriangle;

	public ElementTriangle() {
		this.setAttributeTriangle("T");
	}

	public String getAttributeTriangle() {
		return this.attributeTriangle;
	}

	public void setAttributeTriangle(String attributeTriangle) {
		this.attributeTriangle = attributeTriangle;
	}

	@Override
	public void accept(Figure v) {
		v.visitElementTriangle(this);
	}
}