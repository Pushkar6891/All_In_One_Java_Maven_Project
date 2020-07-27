package eg00188;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 5, 4, 2, 1, 7 };

		usingMap(arr);
	}

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

}
