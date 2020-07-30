package eg00705;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		ReverseStringUsingStack obj = new ReverseStringUsingStack();
		String str = "Hello World";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("\nReversed String : ");
		obj.reverseStringUsingStack1(str);
		System.out.println("\n\nReversed String : ");
		System.out.println(obj.reverseStringUsingStack2(str));

	}

	// 1. Using Stack
	public void reverseStringUsingStack1(String str) {

		int n = str.length();

		if (str == null || str.isEmpty() || str.length() == 0) {
			return;
		}

		Stack<Character> stack = new Stack<Character>();

		// push all characters into stack
		for (int i = 0; i < n; i++) {
			stack.push(str.charAt(i));
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

	// 2. Using Stack
	public String reverseStringUsingStack2(String str) {

		int n = str.length();

		if (str == null || str.isEmpty() || str.length() == 0) {
			return null;
		}

		Stack<Character> stack = new Stack<Character>();

		String reversedString = "";
		
		// push all characters into stack
		for (int i = 0; i < n; i++) {
			stack.push(str.charAt(i));
		}

		while (!stack.isEmpty()) {
			reversedString += stack.pop();
		}

		return reversedString;
	}

}
