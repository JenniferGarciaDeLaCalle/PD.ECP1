package calculatorMemento;

import calculator.Comando;

public class UndoCommand extends Comando {

	public UndoCommand(CalculatorMementable calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		((CalculatorMementable) getCal()).restoreMemento();
	}

	@Override
	public String name() {
		return "Deshacer";
	}

}
