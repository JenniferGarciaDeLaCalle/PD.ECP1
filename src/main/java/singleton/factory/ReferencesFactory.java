package singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {

	private static final ReferencesFactory factory = new ReferencesFactory();
	private Map<String, Integer> references;
	private int reference;

	public ReferencesFactory() {
		this.references = new HashMap<String, Integer>();
		this.reference = 0;
	}

	public static ReferencesFactory getFactory() {
		return factory;
	}

	public int getReference(String key) {
		Integer result = this.references.get(key);
		if (result == null) {
			this.references.put(key, this.reference);
			result = this.reference;
			reference++;
		}
		return result;
	}

	public void removeReference(String key) {
		this.references.remove(key);
	}

}
