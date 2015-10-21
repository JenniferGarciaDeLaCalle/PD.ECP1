package composite.expression;

public abstract class Expresion {

	public abstract void add(Expresion subNodo);

	public abstract void remove(Expresion subNodo);

	public abstract int operar();

	public abstract String toString();
}
