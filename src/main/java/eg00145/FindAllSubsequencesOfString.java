package eg00145;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindAllSubsequencesOfString {

	// Driver code
	public static void main(String[] args) {
		String s = "abca";
		subsequence(s);
		System.out.println(st);
	}

	// set to store all the subsequences
	static Set<String> st = new LinkedHashSet<>();

	// It computes all the subsequence of an string
	static void subsequence(String str) {
		// iterate over the entire string
		for (int i = 0; i < str.length(); i++) {

			// iterate from the end of the string
			// to generate substrings
			for (int j = str.length(); j > i; j--) {
				String sub_str = str.substring(i, j);

				if (!st.contains(sub_str))
					st.add(sub_str);

				// drop kth character in the substring
				// and if its not in the set then recur
				for (int k = 1; k < sub_str.length() - 1; k++) {
					StringBuffer sb = new StringBuffer(sub_str);

					// drop character from the string
					sb.deleteCharAt(k);
					if (!st.contains(sb))
						;
					subsequence(sb.toString());
				}
			}
		}
	}

}
