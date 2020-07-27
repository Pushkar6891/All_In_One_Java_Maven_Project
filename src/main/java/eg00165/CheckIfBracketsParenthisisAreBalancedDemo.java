package eg00165;

import java.util.Stack;

public class CheckIfBracketsParenthisisAreBalancedDemo {

	public static void main(String[] args) {
		CheckIfBracketsParenthisisAreBalancedDemo obj = new CheckIfBracketsParenthisisAreBalancedDemo();
		String str = "{A+B*(C/D)+[E*F*G+(H/I)-(J*K)]}";
		System.out.println("Original String :");
		System.out.println(str);
		boolean result = obj.areBracketsParanthesisBalancedUsingStack(str);
//		boolean result = obj.areParanthesisBalanced(str);
		System.out.println(result);
	}

	public boolean areBracketsParanthesisBalancedUsingStack(String str) {
		char[] arr = str.toCharArray();
		int n = str.length();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < n; i++) {
			char ch = arr[i];
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
				continue;
			}

			if (stack.isEmpty())
				return false;

			switch (ch) {
			case ')':
				stack.pop();
				if (ch == '{' || ch == '[')
					return false;
				break;

			case '}':
				stack.pop();
				if (ch == '(' || ch == '[')
					return false;
				break;

			case ']':
				stack.pop();
				if (ch == '(' || ch == '{')
					return false;
				break;
			}
		}
		return false;
	}

}
