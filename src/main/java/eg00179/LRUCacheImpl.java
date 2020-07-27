package eg00179;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {

	Deque<CacheEntry> q = new LinkedList<>();
	Map<Integer, CacheEntry> map = new HashMap<>();
	int cache_size = 3;

	public LRUCacheImpl(int cache_size) {
		this.cache_size = cache_size;
	}

	public String getFromCache(int key) {
		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			q.remove(entry);
			q.addFirst(entry);
			return entry.value;
		}

		return null;
	}

	public void putEntryIntoCache(int key, String value) {
		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			q.remove(entry);
		} else {
			if (q.size() == cache_size) {
				CacheEntry entryToBeRemoved = q.removeLast();
				map.remove(entryToBeRemoved.key);
			}
		}

		CacheEntry newEntry = new CacheEntry(key, value);
		q.addFirst(newEntry);
		map.put(key, newEntry);
	}

}