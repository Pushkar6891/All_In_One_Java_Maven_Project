package eg00196;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindFirstDuplicateElement {

	public static void main(String[] args) {

		FindFirstDuplicateElement obj = new FindFirstDuplicateElement();
		int[] arr = { 6, 5, 3, 5, 1, 2, 4 };
//		int[] arr = { 6, 5, 3, 2, 1, 2, 4 };
		// Using Brute Force
		// Using Set
		// Using Map

		System.out.println("1. Using Brute Force Nested Loop");
		System.out.println(obj.usingBruteForce(arr));
		System.out.println("2. Using HashSet");
		System.out.println(obj.usingSet(arr));
		System.out.println();
//		usingMap(arr);
	}

	public int usingBruteForce(int[] arr) {
		int n = arr.length;
		int firstDuplicateElement = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j] && i != j) {
					firstDuplicateElement = arr[j];
					break;
				}
			}
		}

		return firstDuplicateElement;
	}

	public int usingSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int firstDuplicateElement = Integer.MIN_VALUE;
		int n = arr.length;
		int temp = -1;
		for (int i = n - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				temp = i;
			} else {
				set.add(arr[i]);
			}
		}
		if(temp!=-1) {
			firstDuplicateElement = arr[temp];
		}else {
			System.out.println("No first duplicate founf");
		}
		
		return firstDuplicateElement;
	}

	// Find all duplicate elements
	/*
	public static void usingMap(int[] arr) {
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
	*/

}