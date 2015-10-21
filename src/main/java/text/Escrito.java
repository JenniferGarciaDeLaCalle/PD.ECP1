package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

	private List<Componente> lista;

	public Escrito() {
		this.lista = new ArrayList<Componente>();
	}

	public abstract void add(Componente subNodo);

	public abstract void remove(Componente subNodo);

	@Override
	public String dibujar(Boolean dibujar) {
		String cadena = "";
		List<Componente> lista = getLista();
		for (int i = 0; i < lista.size(); i++) {
			cadena += lista.get(i).dibujar(dibujar);
		}
		cadena = cadena + dibujarFinal();
		return cadena;
	}

	public abstract String dibujarFinal();

	public List<Componente> getLista() {
		return lista;
	}

	public void setLista(List<Componente> lista) {
		this.lista = lista;
	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
