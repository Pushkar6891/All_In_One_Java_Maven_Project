package eg00048;

public class ReverseStringDemo {

	public static void main(String[] args) {

		String str = "My name is Pushkar Chauhan";
		ReverseStringDemo obj = new ReverseStringDemo();
		String result = obj.reverseStringUsingStringBuilder(str);
		System.out.println(result);
	}

	public String reverseStringUsingStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
