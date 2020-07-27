package eg00155;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraverseIntegerStringMapDemo {

	public static void main(String[] args) {

		TraverseIntegerStringMapDemo obj = new TraverseIntegerStringMapDemo();
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "one zero one");
		map.put(201, "two zero one");
		map.put(789, "seven eight nine");
		System.out.println("Size : " + map.size());

		System.out.println("\n1. Using Iterator And EntrySet 1 Way");
		obj.traverseIntegerStringMapUsingIteratorAndentrySet(map);
		System.out.println("\n2. Using Iterator And keySet 2 Way");
		obj.traverseIntegerStringMapUsingIteratorAndkeySet(map);
		System.out.println("\n3. Using Java 8 Iterable.forEach() 1 Way");
		obj.traverseIntegerStringMapUsingJava8Stream(map);
		System.out.println("\n4. Using map.keySet() and map.values()");
		obj.traverseIntegerStringMapUsingOnlyKeysAndOnlyValues(map);

	}

	public void traverseIntegerStringMapUsingIteratorAndentrySet(Map<Integer, String> map) {
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.print(entry.getKey() + " " + entry.getValue());
		}
	}

	public void traverseIntegerStringMapUsingIteratorAndkeySet(Map<Integer, String> map) {
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.print(key + " " + map.get(key));
		}
	}

	public void traverseIntegerStringMapUsingJava8Stream(Map<Integer, String> map) {
		map.forEach((k, v) -> System.out.print(k + " " + v));
	}

	public void traverseIntegerStringMapUsingOnlyKeysAndOnlyValues(Map<Integer, String> map) {
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}
