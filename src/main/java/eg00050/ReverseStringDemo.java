package eg00050;

public class ReverseStringDemo {

	public static void main(String[] args) {

		String str = "My name is Pushkar Chauhan";
		ReverseStringDemo obj = new ReverseStringDemo();
		obj.reverseStringUsingArrayReversal(str);

	}

	public void reverseStringUsingArrayReversal(String str) {
		char[] charArray = str.toCharArray();
		int n = charArray.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
