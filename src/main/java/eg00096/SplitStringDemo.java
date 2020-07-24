package eg00096;

public class SplitStringDemo {

	public static void main(String[] args) {

		SplitStringDemo obj = new SplitStringDemo();
		String str = "Welcome to KK Java Tutorials";
		int result = obj.countNumberOfWords(str);
		System.out.println(result);
	}

	public int countNumberOfWords(String inputText) {
		// Handle base condition if inputText is null or empty string.
		if (inputText == null || inputText.trim().isEmpty()) {
			System.out.println("Enter valid input text/String");
			return 0;
		}
		int wordsCount = 0;
		char charArray[] = new char[inputText.length()];
		for (int i = 0; i < inputText.length(); i++) {
			charArray[i] = inputText.charAt(i);
			// This check is necessary so that we do not try to read beyond the
			// string length
			if (i + 1 < inputText.length()) {
				charArray[i + 1] = inputText.charAt(i + 1);
			}

			/*
			 * This logic is that after reading the last character in a word it should be
			 * followed by either space or tab, in that case we increment the count value by
			 * 1
			 */
			if ((i + 1 < inputText.length() && (charArray[i] != ' ' && charArray[i] != '\t')
					&& (charArray[i + 1] == ' ' || charArray[i + 1] == '\t'))
					|| (i + 1 == inputText.length() && charArray[i] != ' ')) {
				wordsCount++;
			}
		}
		return wordsCount;
	}

}
