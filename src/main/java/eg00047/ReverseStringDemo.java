package eg00047;

public class ReverseStringDemo {

	public static void main(String[] args) {

		String str = "My name is Pushkar Chauhan";
		//String str = "";
		//String str = null;
		ReverseStringDemo obj = new ReverseStringDemo();
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
