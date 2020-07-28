package eg00706;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {

		ReverseStringUsingStringBuffer obj = new ReverseStringUsingStringBuffer();
		String str = "Hello World";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("Reversed String : ");
		System.out.println(obj.reverseStringUsingStringBuffer(str));

	}

	// 1. Using StringBuffer
	public String reverseStringUsingStringBuffer(String str) {

		int n = str.length();

		if (str == null || str.isEmpty() || n == 0) {
			return null;
		}

		return new StringBuffer(str).reverse().toString();
	}

}
