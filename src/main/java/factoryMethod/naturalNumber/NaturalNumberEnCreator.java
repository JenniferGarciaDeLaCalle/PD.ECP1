package factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	public NaturalNumberEnCreator() {
	}

	@Override
	public NaturalNumber createProduct() {
		return new NaturalNumberEn();
	}

}
