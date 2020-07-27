package eg00179;

public class Tester {

	public static void main(String[] args) {

		LRUCacheImpl cache = new LRUCacheImpl(3);
		cache.putEntryIntoCache(1, "Product-1-Info");
		cache.putEntryIntoCache(2, "Product-2-Info");
		cache.putEntryIntoCache(3, "Product-3-Info");
		cache.putEntryIntoCache(4, "Product-4-Info");

		System.out.println(cache.getFromCache(2));
		System.out.println(cache.getFromCache(6));
	}

}
