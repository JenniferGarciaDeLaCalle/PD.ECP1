package factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumber naturalNumber;

	private NaturalNumberCreator naturalNumberCreator;

	public NaturalNumberManager() {
	}

	public void setCreator(NaturalNumberCreator creator) {
		this.naturalNumberCreator = creator;
	}

	public void createProduct() {
		this.naturalNumber = this.naturalNumberCreator.createProduct();
	}

	public NaturalNumber getProduct() {
		return naturalNumber;
	}
}
