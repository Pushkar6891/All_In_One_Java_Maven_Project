package eg00246;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// majority element occurs atleast n/2 times
public class FindMajorityElementInArray {

	public static void main(String[] args) {

		FindMajorityElementInArray obj = new FindMajorityElementInArray();
//		int[] arr1 = { 3, 3, 2, 2, 3, 2, 3 };
		int[] arr1 = { 1, 1, 4, 1, 4, 4, 1, 4, 4 };
		System.out.println("1.Using HashMap");
		obj.findMajorityElementUsingHashMap(arr1);
	}

	public void findMajorityElementUsingHashMap(int[] arr) {
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

		int val = n / 2;
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value > val)
				System.out.print(key + " ");
		}
	}

}
