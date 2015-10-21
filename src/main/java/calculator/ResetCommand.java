package calculator;

public class ResetCommand extends Comando {

	public ResetCommand(Calculator calculator) {
		setCal(calculator);
	}

	@Override
	public void execute() {
		Calculator cal = getCal();
		cal.reset();
		setCal(cal);
	}

	@Override
	public String name() {
		return "Reset";
	}

}
