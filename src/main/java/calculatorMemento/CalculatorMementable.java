package calculatorMemento;

import calculator.Calculator;

public class CalculatorMementable extends Calculator {

	public void createMemento() {
		MementoCalculator.addMemento("", getTotal());
	}

	public void restoreMemento() {
		setTotal(MementoCalculator.getMemento());
	}
}
