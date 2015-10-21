package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static final FactoriaCaracter factory = new FactoriaCaracter();
	private Map<String, Componente> map;

	public FactoriaCaracter() {
		this.map = new HashMap<String, Componente>();
	}

	public static FactoriaCaracter getFactoria() {
		return factory;
	}

	public Componente get(char key) {
		Componente result = this.map.get(key + "");
		if (result == null) {
			result = new Caracter(key);
			// result = new Frase();
			// result.add(new Caracter(key));
			this.map.put(key + "", result);
		}
		return result;
	}

}
