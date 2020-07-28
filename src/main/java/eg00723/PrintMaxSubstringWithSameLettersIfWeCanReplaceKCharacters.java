package eg00723;

import java.util.HashMap;
import java.util.Map;

public class PrintMaxSubstringWithSameLettersIfWeCanReplaceKCharacters {

	public int longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(String str, int k) {
		if (str == null || str.length() == 0 || k <= 0 || k > str.length()) {
			return -1;
		}

		int maxLength = 0;
		int start, end;
		start = end = 0;
		int maxFreq = 0;

		Map<Character, Integer> map = new HashMap<>();

		while (end < str.length()) {
			char currentChar = str.charAt(end);
			map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

			maxFreq = Math.max(maxFreq, map.get(currentChar));

			if (end - start + 1 - maxFreq > k) {
				char startChar = str.charAt(start);
				map.put(startChar, map.get(startChar) - 1);

				start++;
			}

			maxLength = Math.max(end - start + 1, maxLength);
			end++;
		}
		// print Substring
		printLongestSubstring(str, start, end);

		return maxLength;
	}

	public void printLongestSubstring(String str, int start, int end) {
		System.out.println("Longest Substring : ");
		for (int i = start; i < end; i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {

		PrintMaxSubstringWithSameLettersIfWeCanReplaceKCharacters obj = new PrintMaxSubstringWithSameLettersIfWeCanReplaceKCharacters();
		String str = "bccbababd";
		int k = 2;
		int longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace = obj
				.longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace(str, k);
		System.out.println("\nLength of Longest Substring if k characters can be replaced : ");
		System.out.println(longestSubstringLengthWithSameLettersWithKLettersAllowedToReplace);
	}

}