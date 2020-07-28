package eg00702;

public class TrimString {

	public static void main(String[] args) {

		TrimString obj = new TrimString();
		// String str = " hello user welcome ";
		// String str = " Hello";
		// String str = "Hello";
		String str = "     Hello   ";
		System.out.println("Original String Untrimmed Length : " + str.length());
		System.out.println(str);
		String trimmedString = obj.trimString(str);
		System.out.println("Resultant Trimmed String  Length : " + trimmedString.length());
		System.out.println(trimmedString);

	}

	public String trimString(String str) {
		int n = str.length();
		char[] arr = str.toCharArray();

		int start = 0;
		int end = n - 1;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != ' ') {
				start = i;
				break;
			}
		}

		for (int i = n - 1; i > start - 1; i--) {
			if (arr[i] != ' ') {
				end = i;
				break;
			}
		}

		count = end - start + 1;

		String trimmedResult = new String(arr, start, count);

		return trimmedResult;
	}

}
