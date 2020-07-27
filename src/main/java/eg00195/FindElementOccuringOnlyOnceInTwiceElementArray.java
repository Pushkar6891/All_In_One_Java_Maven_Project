package eg00195;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FindElementOccuringOnlyOnceInTwiceElementArray {

	public static void main(String[] args) {

		FindElementOccuringOnlyOnceInTwiceElementArray obj = new FindElementOccuringOnlyOnceInTwiceElementArray();
		int[] arr = { 5, 3, 4, 5, 2, 3, 4 };
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Element occurring only once Using HashMap : ");
		System.out.println(obj.findElementUsingHashMap(arr));
		System.out.println("Element occurring only once Using XOR : ");
		System.out.println(obj.findElementUsingXOR(arr));

	}

	public int findElementUsingHashMap(int[] arr) {
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
