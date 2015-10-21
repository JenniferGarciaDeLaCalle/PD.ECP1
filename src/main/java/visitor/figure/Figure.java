package visitor.figure;

public abstract class Figure {

	public Figure(String description) {
	}

	public abstract double area();

	public abstract double numberOfSides();

	public abstract void visitElementCircle(ElementCircle e);

	public abstract void visitElementSquare(ElementSquare e);

	public abstract void visitElementTriangle(ElementTriangle e);
}
