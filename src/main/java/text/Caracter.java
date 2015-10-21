package text;

public class Caracter extends Componente {

	char caracter;

	public Caracter(char caracter) {
		this.caracter = caracter;
	}

	public char getCaracter() {
		return this.caracter;
	}

	public void add(Componente comp) {
	}

	public void remove(Componente subNodo) {
	}

	@Override
	public String dibujar(Boolean dibujar) {
		String caracter = this.caracter + "";
		if (dibujar) {
			caracter = caracter.toUpperCase();
		}
		return caracter;
	}

	public String dibujarFinal() {
		return "";
	}

	@Override
	public boolean isComposite() {
		return false;
	}

}
