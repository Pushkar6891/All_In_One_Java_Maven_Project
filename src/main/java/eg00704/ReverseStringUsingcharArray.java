package eg00704;

public class ReverseStringUsingcharArray {

	public static void main(String[] args) {

		ReverseStringUsingcharArray obj = new ReverseStringUsingcharArray();
		String str = "Hello World";
		System.out.println("Original String : ");
		System.out.println(str);
		String reverseString1 = obj.reverseStringUsingCharArray1(str);
		System.out.println("Reversed String 1 : ");
		System.out.println(reverseString1);
		String reverseString2 = obj.reverseStringUsingCharArray2(str);
		System.out.println("Reversed String 2 : ");
		System.out.println(reverseString2);
		System.out.println("Reversed String 3 : ");
		obj.reverseStringUsingArrayReversal(str);
	}

	// 1. Using String reversedString = new String(reversedCharArray)
	public String reverseStringUsingCharArray1(String str) {

		if (str == null || str.isEmpty() || str.length() == 0) {
			return str;
		}

		int n = str.length();
		char[] arr = str.toCharArray();

		int start = 0;
		int end = n - 1;

		while (start < end) {
			// swap characters
			char c = arr[start];
			arr[start] = arr[end];
			arr[end] = c;

			start++;
			end--;
		}

		String reversedString = new String(arr);
		return reversedString;
	}

	// 2. Using String.copyValueOf(char[])
	public String reverseStringUsingCharArray2(String str) {

		if (str == null || str.isEmpty() || str.length() == 0) {
			return str;
		}

		int n = str.length();
		char[] arr = str.toCharArray();

		int start = 0;
		int end = n - 1;

		while (start < end) {
			// swap characters
			char c = arr[start];
			arr[start] = arr[end];
			arr[end] = c;

			start++;
			end--;
		}

		return String.copyValueOf(arr);
	}

	// 3. Convert String to Character Array and print traverse array from rear end
	public void reverseStringUsingArrayReversal(String str) {
		char[] charArray = str.toCharArray();
		int n = charArray.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
