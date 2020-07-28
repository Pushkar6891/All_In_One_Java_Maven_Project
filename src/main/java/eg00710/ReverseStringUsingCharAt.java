package eg00710;

public class ReverseStringUsingCharAt {

	public static void main(String[] args) {

		String str = "My name is Pushkar Chauhan";
		//String str = "";
		//String str = null;
		ReverseStringUsingCharAt obj = new ReverseStringUsingCharAt();
		String result = obj.reverseStringUsingCharAt(str);
		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + result);

	}

	public String reverseStringUsingCharAt(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		int n = str.length();
		String reversedString = "";
		for (int i = n - 1; i >= 0; i--) {
			reversedString = reversedString + str.charAt(i);
		}
		return reversedString;
	}

}
