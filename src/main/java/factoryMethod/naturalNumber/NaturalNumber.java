package factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	private int value;

	private String[] textValue;

	public NaturalNumber() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void setTextValue(String[] textValue) {
		this.textValue = textValue;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public String getTextValue() {
		if (this.value < textValue.length) {
			return textValue[this.value];
		} else {
			return "???";
		}
	}

}
