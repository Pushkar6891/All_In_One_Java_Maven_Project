package eg00707;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {

		ReverseStringUsingStringBuilder obj = new ReverseStringUsingStringBuilder();
		String str = "Hello World";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("Reversed String : ");
		System.out.println(obj.reverseStringUsingStringBuilder(str));

	}

	// 1. Using StringBuilder
	public String reverseStringUsingStringBuilder(String str) {

		int n = str.length();

		if (str == null || str.isEmpty() || n == 0) {
			return null;
		}

		return new StringBuilder(str).reverse().toString();
	}

}
