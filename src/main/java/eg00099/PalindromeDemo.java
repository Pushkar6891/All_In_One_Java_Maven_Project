package eg00099;

public class PalindromeDemo {

	public static void main(String[] args) {
		PalindromeDemo obj = new PalindromeDemo();
		String[] arr = { "abc", "abcba", "ab", "aa", "aba" };
		for (String value : arr) {
			String reversedString = obj.reverseString(value);
			if (value.equalsIgnoreCase(reversedString)) {
				System.out.println(value + " " + "is palindrome");
			} else {
				System.out.println(value + " " + "is not palindrome");
			}
		}
	}

	public String reverseString(String str) {
//		if (str == null || str.trim().isEmpty()) {
//			return "";
//		}

		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}

		return reversedString;
	}

}
