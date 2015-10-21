package composite.expression;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacion extends Expresion {

	private List<Expresion> lista;

	public Operacion() {
		this.lista = new ArrayList<Expresion>();
	}

	public Operacion(String nombre) {
		this.lista = new ArrayList<Expresion>();
	}

	@Override
	public void add(Expresion subNodo) {
		if (subNodo != null) {
			this.lista.add(subNodo);
		}
	}

	@Override
	public void remove(Expresion subNodo) {
		if (subNodo != null) {
			this.lista.remove(subNodo);
		}
	}

	public abstract int operar();

	public abstract String toString();

	public List<Expresion> getLista() {
		return lista;
	}

}
