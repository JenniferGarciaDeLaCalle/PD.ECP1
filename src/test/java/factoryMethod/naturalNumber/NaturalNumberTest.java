package factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {

	private NaturalNumber num1, num2;

	@Before
	public void ini() {
		NaturalNumberCreator creator1 = new NaturalNumberEsCreator();
		num1 = creator1.createProduct();
		NaturalNumberCreator creator2 = new NaturalNumberEnCreator();
		num2 = creator2.createProduct();
	}

	@Test
	public void testGetValueEs() {
		num1.setValue(0);
		assertEquals(0, this.num1.getValue());
	}

	@Test
	public void testGetValueEn() {
		num2.setValue(5);
		assertEquals(5, this.num2.getValue());
	}

	@Test
	public void testSetTextValueEs() {
		String[] aux = { "cero", "uno" };
		num1.setTextValue(aux);
		num1.setValue(1);
		assertEquals("uno", this.num1.getTextValue());
	}

	@Test
	public void testSetTextValueEn() {
		String[] aux = { "cero", "one" };
		num2.setTextValue(aux);
		num2.setValue(1);
		assertEquals("one", this.num2.getTextValue());
	}

	@Test
	public void testAddEs() {
		num1.add(6);
		assertEquals(6, this.num1.getValue());
	}

	@Test
	public void testAddEn() {
		num2.add(6);
		assertEquals(6, this.num2.getValue());
	}

	@Test
	public void testTextValueEs() {
		num1.setValue(0);
		assertEquals("cero", this.num1.getTextValue());
	}

	@Test
	public void testTextValueEn() {
		num2.setValue(5);
		assertEquals("five", this.num2.getTextValue());
	}
}
