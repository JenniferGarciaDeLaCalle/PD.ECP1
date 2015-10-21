package calculator;

import upm.jbb.IO;

public class AddCommand extends Comando {

	public AddCommand(Calculator calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		Calculator cal = getCal();
		cal.add(IO.getIO().readInt());
		setCal(cal);
	}

	@Override
	public String name() {
		return "Sumar";
	}

}
