package composite.expression;

public class Sumar {
	
	String operacion;
	
	public Sumar(Expresion exp1, Expresion exp2){
		this.operacion = "("+exp1+"+"+exp2+")";
	}

}
