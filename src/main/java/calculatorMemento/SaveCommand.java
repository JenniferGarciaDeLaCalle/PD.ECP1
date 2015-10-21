package calculatorMemento;

import calculator.Comando;

public class SaveCommand extends Comando {

	public SaveCommand(CalculatorMementable calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		((CalculatorMementable) getCal()).createMemento();
	}

	@Override
	public String name() {
		return "Guardar";
	}

}
