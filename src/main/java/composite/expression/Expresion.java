package composite.expression;

public abstract class Expresion {
	
	private static final Expresion Expresion = new Expresion();
	private static final Operacion Operando = new Operacion();
	
	Expresion exp = Expresion + Operando + Expresion;
	
	public Expresion(){
		
	}
	
	public abstract int operar;

}
