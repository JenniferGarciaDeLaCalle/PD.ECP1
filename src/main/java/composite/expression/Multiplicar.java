package composite.expression;

import java.util.List;

public class Multiplicar extends Operacion {

	public Multiplicar(Expresion exp1, Expresion exp2) {
		add(exp1);
		add(exp2);
	}

	@Override
	public int operar() {
		int res = 0;
		for (Expresion subNodo : getLista()) {
			if (res == 0) {
				res = subNodo.operar();
			} else {
				res *= subNodo.operar();
			}
		}
		return res;
	}

	@Override
	public String toString() {
		String cadena = "";
		List<Expresion> lista = getLista();
		for (int i = 1; i < lista.size(); i = i + 2) {
			cadena += "(";
			cadena += lista.get(i - 1).toString();
			cadena += "*";
			cadena += lista.get(i).toString();
			cadena += ")";
		}
		return cadena;
	}

}
