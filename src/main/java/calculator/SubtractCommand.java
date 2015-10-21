package calculator;

import upm.jbb.IO;

public class SubtractCommand extends Comando {

	public SubtractCommand(Calculator calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		Calculator cal = getCal();
		cal.subtract(IO.getIO().readInt());
		setCal(cal);
	}

	@Override
	public String name() {
		return "Restar";
	}

}
