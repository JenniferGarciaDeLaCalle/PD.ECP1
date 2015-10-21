package visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {
	private Collection<Element> coleccion = new ArrayList<Element>();

	@Before
	public void ini() {
		coleccion.add(new ElementCircle());
		coleccion.add(new ElementTriangle());
		coleccion.add(new ElementSquare());
	}

	@Test
	public void testVisitorCircle() {
		Circle c = new Circle("Circle", 1);
		for (Element elemento : coleccion) {
			elemento.accept(c);
		}
		assertEquals(3.141592653, c.area(), 10e-10);
	}

	@Test
	public void testVisitorTriangle() {
		Triangle t = new Triangle("Triangle", 2, 1);
		for (Element elemento : coleccion) {
			elemento.accept(t);
		}
		assertEquals(1, t.area(), 10e-10);
	}

	@Test
	public void testVisitorSquare() {
		Square s = new Square("Square", 2);
		for (Element elemento : coleccion) {
			elemento.accept(s);
		}
		assertEquals(4, s.area(), 10e-10);
	}

}
