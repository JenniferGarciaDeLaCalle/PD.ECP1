package calculator;

public abstract class Comando implements Order {

	private Calculator cal;

	public Calculator getCal() {
		return cal;
	}

	public void setCal(Calculator calAux) {
		cal = calAux;
	}

}
