package eg00708;

import java.util.Stack;

public class ReverseStringByWordOrReverseIndiviualWordsInString {

	public static void main(String[] args) {
		ReverseStringByWordOrReverseIndiviualWordsInString obj = new ReverseStringByWordOrReverseIndiviualWordsInString();
		String str = "My name is Pushkar Chauhan";

		System.out.println("Original String : ");
		System.out.println(str);

		String result1 = obj.reverseStringByWord(str);
		System.out.println("\nReversed String 1 : ");
		System.out.println(result1.trim());

		System.out.println("\nReversed String 2 : ");
		String result2 = obj.reverseIndividualWord(str);
		System.out.println(result2);

		System.out.println("\nReversed String 3 Using StringBuilder word by word: ");
		String result3 = obj.reverseIndividualWordStringBuilder(str);
		System.out.println(result3);

		System.out.println("\nReversed String 4 Using Stack: ");
		obj.reverseIndividualWordStack(str);

		System.out.println("\n\nReversed String 5");
		String result5 = obj.printReversedStringbyWords(str);
		System.out.println(result5);

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

	public String printReversedStringbyWords(String str) {
		int n = str.length();
		String finalString = "";
		String tempString = "";

		// Boundary Checks
		if (str == null || n == 0 || str.isEmpty()) {
			System.out.println("Invalid String");
		}

		// Loop through Array for every char
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);

			// if space is encountered
			if (ch == ' ') {
				finalString = " " + tempString + finalString;
				tempString = "";
			}
			// if no space append characters into tempString
			else {
				tempString += ch;
			}
		}

		finalString = tempString + finalString;
		return finalString;

	}

}
