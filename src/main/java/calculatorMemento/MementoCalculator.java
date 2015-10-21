package calculatorMemento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MementoCalculator {

	private static Map<String, Integer> valores = new HashMap<String, Integer>();
	private static int clave = -1;

	public static void addMemento(String name, Integer value) {
		clave++;
		valores.put(clave + "", value);
	}

	public static Integer getMemento() {
		Object[] collection = valores.values().toArray();
		if (collection.length > 0) {
			int valor = (int) collection[collection.length - 1];
			valores.remove(clave + "", valor);
			clave--;
			return valor;
		} else {
			return 0;
		}
	}

	public String[] claves() {
		Set<String> set = valores.keySet();
		String[] claves = new String[set.size()];
		set.toArray(claves);
		return claves;
	}
}
