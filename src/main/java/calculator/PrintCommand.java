package calculator;

import upm.jbb.IO;

public class PrintCommand extends Comando {

	public PrintCommand(Calculator calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		IO.getIO().println(getCal().getTotal());
	}

	@Override
	public String name() {
		return "Imprimir";
	}

}
