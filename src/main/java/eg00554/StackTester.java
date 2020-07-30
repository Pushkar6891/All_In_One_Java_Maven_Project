package eg00554;

public class StackTester {

	public static void main(String[] args) {
		StackImpl a = new StackImpl();
		String s1 = a.infixToPostfix("2+3-1");
		System.out.println(s1);

		String s2 = a.infixToPostfix("2+3*4");
		System.out.println(s2);

		String s3 = a.infixToPostfix("3*(4+5)-6/(1+2)");
		System.out.println(s3);
	}

}