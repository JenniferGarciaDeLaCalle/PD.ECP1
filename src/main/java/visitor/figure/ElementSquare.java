package visitor.figure;

public class ElementSquare implements Element {

	private String attributeSquare;

	public ElementSquare() {
		this.setAttributeSquare("S");
	}

	public String getAttributeSquare() {
		return this.attributeSquare;
	}

	public void setAttributeSquare(String attributeSquare) {
		this.attributeSquare = attributeSquare;
	}

	@Override
	public void accept(Figure v) {
		v.visitElementSquare(this);
	}
}