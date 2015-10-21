package factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	public NaturalNumberEsCreator() {
	}

	@Override
	public NaturalNumber createProduct() {
		return new NaturalNumberEs();
	}

}
