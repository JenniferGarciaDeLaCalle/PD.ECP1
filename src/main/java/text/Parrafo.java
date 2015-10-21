package text;

import java.util.List;

public class Parrafo extends Escrito {

	public Parrafo() {
	}

	@Override
	public void add(Componente subNodo) {
		if (subNodo != null && !subNodo.isComposite()) {
			List<Componente> lista = getLista();
			lista.add(subNodo);
			setLista(lista);
		} else {
			throw new UnsupportedOperationException("Operación no soportada");
		}
	}

	@Override
	public void remove(Componente subNodo) {
		if (subNodo != null && !subNodo.isComposite()) {
			List<Componente> lista = getLista();
			lista.remove(subNodo);
			setLista(lista);
		}
	}

	@Override
	public String dibujarFinal() {
		return "\n";
	}

}
