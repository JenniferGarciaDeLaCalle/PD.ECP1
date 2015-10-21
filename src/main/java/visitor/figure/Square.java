package visitor.figure;

public class Square extends Figure {

	private double side;

	public Square(String description, double side) {
		super(description);
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double numberOfSides() {
		return 4;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void visitElementCircle(ElementCircle e) {
		System.out.println("Circle --> element: " + e.getAttributeCircle());
	}

	@Override
	public void visitElementSquare(ElementSquare e) {
		System.out.println("Square --> element: " + e.getAttributeSquare());
	}

	@Override
	public void visitElementTriangle(ElementTriangle e) {
		System.out.println("Triangle --> element: " + e.getAttributeTriangle());
	}

}
