package eg00060;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccurringCharUsingMap {

	public static void main(String[] args) {

		MaxOccurringCharUsingMap obj = new MaxOccurringCharUsingMap();
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


		Integer maxCharCount = 0;

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry entry : entrySet) {
			if ((Integer) entry.getValue() > maxCharCount) {
				maxCharCount = (Integer) entry.getValue();
			}
		}

		Set<Character> result = new HashSet<>();
		Character space = ' ';

		for (Entry entry : entrySet) {
			if (entry.getValue() == maxCharCount && entry.getValue() != space) {
				result.add((Character) entry.getKey());
			}
		}

		if (result.contains(' ')) {
			result.remove(' ');
		}

		return result;
	}

}
