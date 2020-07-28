package eg00712;

import java.util.HashSet;
import java.util.Set;

public class FindAndPrintUniqueCharactersInString {

	public static void main(String[] args) {

		String str = "bccbababd";
		// String str = "";
		// String str = null;
		FindAndPrintUniqueCharactersInString obj = new FindAndPrintUniqueCharactersInString();
		String result1 = obj.findUniqueCharactersUsingSet(str);
		System.out.println("No. of Unique Characters : " + result1);

	}

	public String findUniqueCharactersUsingSet(String str) {
		int n = str.length();
		if (str == null || str.isEmpty() || n == 0) {
			return null;
		}

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < n; i++) {
			set.add(str.charAt(i));
		}

		return String.valueOf(set);
		
	}
}
