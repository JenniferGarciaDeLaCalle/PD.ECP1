package text;

public abstract class Componente {

	public abstract void add(Componente comp);

	public abstract void remove(Componente subNodo);

	public abstract String dibujar(Boolean dibujar);

	public abstract String dibujarFinal();

	public abstract boolean isComposite();

}
