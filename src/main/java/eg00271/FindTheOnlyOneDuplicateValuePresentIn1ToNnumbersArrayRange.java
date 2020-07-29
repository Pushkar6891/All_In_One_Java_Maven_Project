package eg00271;
// There is only 1 duplicate value

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindTheOnlyOneDuplicateValuePresentIn1ToNnumbersArrayRange {

	public static void main(String[] args) {

		FindTheOnlyOneDuplicateValuePresentIn1ToNnumbersArrayRange obj = new FindTheOnlyOneDuplicateValuePresentIn1ToNnumbersArrayRange();
		int[] arr = { 2, 3, 4, 2, 1 };
		int findDuplicateValue = obj.findDuplicateValue(arr);
		System.out.println(findDuplicateValue);
		List<Integer> duplicateElementsList = obj.findDuplicateUsingHashMap(arr);
		for (Integer value : duplicateElementsList) {
			System.out.println(value);
		}
	}

	public int findDuplicateValue(int[] arr) {
		if (arr.length <= 1) {
			return -1;
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] != arr[arr[i] - 1]) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

		return arr[arr.length - 1];
	}

	public List<Integer> findDuplicateUsingHashMap(int[] arr) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Integer key = arr[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		if (map.size() > 1) {
			return map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Entry::getKey)
					.collect(Collectors.toList());
		}
		return null;
	}
}
