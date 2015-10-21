package visitor.figure;

public class Circle extends Figure {

	private double radius;

	public Circle(String description, double radius) {
		super(description);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double numberOfSides() {
		return Double.POSITIVE_INFINITY;
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
