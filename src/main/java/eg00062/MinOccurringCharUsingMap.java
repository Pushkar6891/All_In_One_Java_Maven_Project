package eg00062;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MinOccurringCharUsingMap {

	public static void main(String[] args) {

		MinOccurringCharUsingMap obj = new MinOccurringCharUsingMap();
		String str = "My name is PushkarChauhan eee";
		Set<Character> result = obj.getMaxOccurringCharacter(str);
		System.out.println(result);
	}

	public Set<Character> getMaxOccurringCharacter(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println(map);
		Integer minCharCount = 10;

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry entry : entrySet) {
			if ((Integer) entry.getValue() < minCharCount) {
				minCharCount = (Integer) entry.getValue();
			}
		}

		Set<Character> result = new HashSet<>();
		Character space = ' ';

		for (Entry entry : entrySet) {
			if (entry.getValue() == minCharCount && entry.getValue() != space) {
				result.add((Character) entry.getKey());
			}
		}

		if (result.contains(' ')) {
			result.remove(' ');
		}

		return result;
	}

}
