package eg00189;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 5, 4, 2, 1, 7 };
		// Using Brute Force
		// Using Set
		// Using Map

		System.out.println("1. Using Brute Force");
		findDuplicatesUsingBruteForce(arr);
		System.out.println("\n2. Using HashSet");
		findDuplicatesUsingSet(arr);
		System.out.println("\n3. Using HashMap and Iterator");
		findDuplicatesUsingMapAndIterator(arr);
		System.out.println("\n4. Using HashMap and Java 8");
		findDuplicatesUsingMapJava8(arr);
	}

	// Complexity : O(n^2)
	public static void findDuplicatesUsingBruteForce(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
	}

	// Complexity : O(n)
	public static void findDuplicatesUsingSet(int[] input) {
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					// duplicate element found
					duplicates.add(input[i]);
					break;
				}
			}
		}
		duplicates.forEach(result -> System.out.print(result + " "));
	}

	// Complexity : O(n)
	public static void findDuplicatesUsingMapAndIterator(int[] arr) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value > 1)
				System.out.print(key + " ");
		}

	}

	// Complexity : O(n)
	public static void findDuplicatesUsingMapJava8(int[] arr) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

//			Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//			Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
//			while (iterator.hasNext()) {
//				Entry<Integer, Integer> entry = iterator.next();
//				Integer key = entry.getKey();
//				Integer value = entry.getValue();
//				if (value > 1)
//					System.out.print(key + " ");
//			}

		map.forEach((k, v) -> {
			if (v > 1)
				System.out.print(k + " ");
		});
	}

}
