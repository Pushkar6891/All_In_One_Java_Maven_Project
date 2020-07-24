package eg00054;

public class PalindromeDemo {

	public static void main(String[] args) {
		PalindromeDemo obj = new PalindromeDemo();
		String[] arr = { "abc", "abcba", "ab", "aa", "aba" };
		for (String value : arr) {
			String reversedString = obj.reverseString(value);
			if (value.equals(reversedString)) {
				System.out.println(value + " " + "is palindrome");
			} else {
				System.out.println(value + " " + "is not palindrome");
			}
		}
	}

	public String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
