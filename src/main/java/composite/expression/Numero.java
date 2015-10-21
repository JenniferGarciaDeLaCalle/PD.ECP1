package composite.expression;

public class Numero extends Expresion {

	int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public void add(Expresion subNodo) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	public void remove(Expresion subNodo) {
	}

	@Override
	public int operar() {
		return this.numero;
	}

	@Override
	public String toString() {
		return Integer.toString(this.numero);
	}

}
