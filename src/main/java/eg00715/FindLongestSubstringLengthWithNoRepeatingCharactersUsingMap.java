package eg00715;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringLengthWithNoRepeatingCharactersUsingMap {

	public static void main(String[] args) {

		String str = "bccbababd";
		FindLongestSubstringLengthWithNoRepeatingCharactersUsingMap obj = new FindLongestSubstringLengthWithNoRepeatingCharactersUsingMap();
		int lengthOfLongestSubstring = obj.longestSubstringLengthWithNoRepeatedCharactersUsingMap(str);
		System.out.println("\nLength of Longest Substring With No Repeating Character: " + lengthOfLongestSubstring);

	}

	public int longestSubstringLengthWithNoRepeatedCharactersUsingMap(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}

		int maxLength = 0;
		int start, end;
		start = end = 0;

		Map<Character, Integer> map = new HashMap<>();

		while (end < str.length()) {
			char currentChar = str.charAt(end);

			if (map.containsKey(currentChar)) {
				start = Math.max(start, map.get(currentChar) + 1);
			}

			map.put(currentChar, end);
			maxLength = Math.max(end - start + 1, maxLength);

			end++;
		}

		// Printing Longest Substring
		//printLongestSubstring(str, start, end);

		return maxLength;
	}

	/*
	public void printLongestSubstring(String str, int start, int end) {
		System.out.println("Longest Substring : ");
		for (int i = start; i < end; i++) {
			System.out.print(str.charAt(i));
		}
	}
	*/
}
