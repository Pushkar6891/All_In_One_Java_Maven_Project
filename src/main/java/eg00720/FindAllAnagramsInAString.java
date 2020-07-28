package eg00720;

import java.util.ArrayList;
import java.util.List;

// We will return indexes of starting point of anagram
public class FindAllAnagramsInAString {

	public static void main(String[] args) {

		FindAllAnagramsInAString obj = new FindAllAnagramsInAString();
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> allAnagrams1 = obj.findAnagrams1(s, p);
		allAnagrams1.forEach(System.out::println);
		System.out.println();
		List<Integer> allAnagrams2 = obj.findAnagrams2(s, p);
		allAnagrams2.forEach(System.out::println);

	}

	// Using Sliding Window
	public List<Integer> findAnagrams1(String s, String p) {

		int n = s.length();

		List<Integer> result = new ArrayList<>();

		if (n == 0 || s == null) {
			return result;
		}

		// store frequency of each character from a to z
		int[] char_count = new int[26];

		// store a at ath index
		for (char c : p.toCharArray()) {
			char_count[c - 'a']++;
		}

		int left = 0;
		int right = 0;
		int count = p.length();

		while (right < s.length()) {
			if (char_count[s.charAt(right++) - 'a']-- >= 1) {
				count--;
			}

			if (count == 0) {
				result.add(left);
			}

			if (right - left == p.length() && char_count[s.charAt(left++) - 'a']++ >= 0) {
				count++;
			}
		}
		return result;
	}

	public List<Integer> findAnagrams2(String s, String p) {
		int[] charCount = new int[26];

		for (int i = 0; i < p.length(); i++)
			charCount[p.charAt(i) - 'a']++;

		List<Integer> retList = new ArrayList<>();

		// A variation of sliding window: The left and right end represent the end of a
		// window.
		// toVisit gives # elements remaining to be visited in the window, till we slide
		// the window.
		int left = 0, right = 0, toVisit = p.length();
		while (right < s.length()) {
			// If char at right end of window is present in p(charCount)
			if (charCount[s.charAt(right) - 'a'] >= 1) {
				toVisit--;
			}
			charCount[s.charAt(right) - 'a']--; // Reduce count of char at right end.
			right++; // Increment right end.

			if (toVisit == 0)
				retList.add(left);

			// If you have traversed a window completely. Once you've traversed the first
			// p.length() elements
			// ie. the first window this would always be true,
			// this is here just so that we completely scan our first window, without
			// incrementing left.
			if (right - left == p.length()) {
				if (charCount[s.charAt(left) - 'a'] >= 0) {
					// This would increment toVisit for characters which were found at right end and
					// were
					// present in p(charCount) because of which we decremented toVisit in the first
					// if block
					// and then some characters of p were not found in the window so we need to
					// increment.
					toVisit++;
				}
				charCount[s.charAt(left) - 'a']++;
				left++; // Just to slide the window.
			}
		}
		return retList;
	}
}
