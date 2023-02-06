import java.util.HashMap;
import java.util.Map;

public class Cache {
	private static Cache instance;
	private Map<String, Object> cacheMap;

	private Cache() {
		cacheMap = new HashMap<>();
	}

	public static synchronized Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void addToCache(String key, Object value) {
		cacheMap.put(key, value);
	}

	public Object getFromCache(String key) {
		return cacheMap.get(key);
	}
}