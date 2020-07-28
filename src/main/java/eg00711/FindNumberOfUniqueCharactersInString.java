package eg00711;

import java.util.HashSet;
import java.util.Set;

public class FindNumberOfUniqueCharactersInString {

	public static void main(String[] args) {

		String str = "bccbababd";
		// String str = "";
		// String str = null;
		FindNumberOfUniqueCharactersInString obj = new FindNumberOfUniqueCharactersInString();
		int result1 = obj.findUniqueCharactersUsingSet(str);
		System.out.println("No. of Unique Characters : " + result1);

	}

	public int findUniqueCharactersUsingSet(String str) {
		int n = str.length();
		if (str == null || str.isEmpty() || n == 0) {
			return 0;
		}

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < n; i++) {
			set.add(str.charAt(i));
		}

		return set.size();
	}
}
