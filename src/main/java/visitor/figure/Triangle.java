package visitor.figure;

public class Triangle extends Figure {
	private double base;

	private double height;

	public Triangle(String description, double base, double height) {
		super(description);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base * height * 0.5;
	}

	@Override
	public double numberOfSides() {
		return 3;
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