package eg00263;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindElementOccuringOnlyOnceInTwiceElementSortedArray {

	public static void main(String[] args) {

		FindElementOccuringOnlyOnceInTwiceElementSortedArray obj = new FindElementOccuringOnlyOnceInTwiceElementSortedArray();
//		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int[] arr = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Element occurring only once Using HashMap : ");
		System.out.println(obj.findElementUsingHashMap1(arr));
		System.out.println("Element occurring only once Using HashMap : ");
		System.out.println(obj.findElementUsingHashMap2(arr));
		System.out.println("Element occurring only once Using XOR : ");
		System.out.println(obj.findElementUsingXOR(arr));

	}

	// Complexity : O(n)
	public int findElementUsingHashMap1(int[] arr) {
		int n = arr.length;
		int result = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int element = arr[i];
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}

		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() == 1) {
				result = entry.getKey();
			}
		}

		return result;
	}

	// Complexity : O(n)
	public int findElementUsingHashMap2(int[] arr) {
		int n = arr.length;
		int result = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int element = arr[i];
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				result = entry.getKey();
				break;
			}
		}

		return result;
	}

	// Complexity : O(n)
	public int findElementUsingXOR(int[] arr) {
		int n = arr.length;
		int xor = arr[0];
		// starting loop from 1 as 0th element is already initialized
		for (int i = 1; i < n; i++) {
			xor = xor ^ arr[i];
		}

		return xor;

	}

}
