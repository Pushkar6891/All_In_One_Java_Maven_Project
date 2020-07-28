package eg00705;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		ReverseStringUsingStack obj = new ReverseStringUsingStack();
		String str = "Hello World";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("Reversed String : ");
		obj.reverseStringUsingStack(str);
		

	}

	// 1. Using Stack
	public void reverseStringUsingStack(String str) {

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

}
