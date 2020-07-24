package eg00088;

public class ReverseStringUsingRecursionDemo {

	public static void main(String[] args) {

		ReverseStringUsingRecursionDemo obj = new ReverseStringUsingRecursionDemo();
		String str = "abcdef";
		String result = obj.reverse(str);
		System.out.println("Original String : " + str);
		System.out.println("Result String : " + result);
		
	}

	public String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
