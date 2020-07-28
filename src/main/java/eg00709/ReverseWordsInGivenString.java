package eg00709;

import java.util.Stack;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		ReverseWordsInGivenString obj = new ReverseWordsInGivenString();
		String str = "My name is Pushkar Chauhan";
		System.out.println("Original String : ");
		System.out.println(str);
		System.out.println("\n1. Reversed String 1: ");
		System.out.println(obj.reverseWords(str));
		System.out.println("\n2. Reversed String 2: ");
		System.out.println(obj.reverseWordsStringBuilder(str));
		System.out.println("\n3. Reversed String 3: ");
		System.out.println(obj.reverseWordsUsingReverse(str));

	}

	public String reverseStringByWord(String str) {
		StringBuilder sb = new StringBuilder();
		String[] splitStr = str.split(" ");
		for (int i = 0; i < splitStr.length; i++) {
			String reversedStr = reverseStringUsingStringBuilder(splitStr[i]);
			sb.append(reversedStr);
		}
		return sb.toString();
	}

	public String reverseStringUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString() + " ";
	}

	public String reverseIndividualWordStringBuilder(String str) {

		StringBuilder finalStr = new StringBuilder();
		StringBuilder tempStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr = finalStr.append(tempStr).append(" ");
				tempStr.setLength(0);
			} else {
				tempStr.insert(0, c);
			}
		}

		finalStr = finalStr.append(tempStr);

		return finalStr.toString();
	}

	public String reverseIndividualWord(String str) {

		String finalStr = "";
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr = finalStr + tempStr + " ";
				tempStr = "";
			} else {
				tempStr = c + tempStr;
			}
		}

		finalStr = finalStr + tempStr;

		return finalStr;
	}

	public void reverseIndividualWordStack(String str) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				while (!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			} else {
				st.push(c);
			}
		}

		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

	public String reverseWords(String str) {

		String finalStr = "";
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr = " " + tempStr + finalStr;
				tempStr = "";
			} else {
				tempStr = tempStr + c;
			}
		}

		finalStr = tempStr + finalStr;

		return finalStr;
	}

	public String reverseWordsStringBuilder(String str) {

		StringBuilder finalStr = new StringBuilder();
		StringBuilder tempStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ') {
				finalStr.insert(0, tempStr).insert(0, " ");
				tempStr.setLength(0);
			} else {
				tempStr.append(c);
			}
		}

		finalStr.insert(0, tempStr);

		return finalStr.toString();
	}

	public String reverseWordsUsingReverse(String str) {
		str = reverseString(str);
		str = reverseIndividualWord(str);

		return str;
	}

	public String reverseString(String str) {
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}

		return s;
	}

}
