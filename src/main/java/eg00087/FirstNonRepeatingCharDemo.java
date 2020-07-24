package eg00087;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharDemo {

	public static void main(String[] args) {

		FirstNonRepeatingCharDemo obj = new FirstNonRepeatingCharDemo();
		String str = "abcbdacnn";
		char result = obj.getFirstNonRepeatingChar(str);
		System.out.println("First Non Repeating Char : " + result);
	}

	public char getFirstNonRepeatingChar(String str) {
		char ch = ' ';
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		int n = charArray.length;
		for (int i = 0; i < n; i++) {
			char key = charArray[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		System.out.println(map);

		int count = 10;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if (entry.getValue() == 1) {
				count = entry.getValue();
				ch = entry.getKey();
				break;
			}
		}
		return ch;
	}

}
