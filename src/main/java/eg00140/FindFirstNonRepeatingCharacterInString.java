package eg00140;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		FindFirstNonRepeatingCharacterInString obj = new FindFirstNonRepeatingCharacterInString();
	//	String str = "allahabad";
		String str = "ajcsbabceqbwvacbcgsjdvhbanbhvcksbdacbcnmcbjksvdfhjlbs";
		int n = str.length();
		System.out.println(obj.findFirstNonRepeatingCharacter(str, n));
	}

	public Character findFirstNonRepeatingCharacter(String str, int n) {
		Character firstNonRepeatingChar = null;
		if (n == 0 || str.isEmpty() || str == null) {
			return null;
		}

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if (value == 1) {
				firstNonRepeatingChar = key;
				return firstNonRepeatingChar;
			}
		}

		return firstNonRepeatingChar;
	}

}
