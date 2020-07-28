package eg00701;

public class PrintFirstCharaacterOfEveryWordInString {

	public static void main(String[] args) {

		PrintFirstCharaacterOfEveryWordInString obj = new PrintFirstCharaacterOfEveryWordInString();
		// String str = "My name is Pushkar Chauhan";
		// String str = " My name is Pushkar Chauhan";
		String str = " My name is Pushkar Chauhan ";
		obj.printFirstCharacterOfEachWord(str);
		System.out.println("");
		obj.printFirstCharacterOfEachWordShortcut(str);
	}

	public void printFirstCharacterOfEachWordShortcut(String str) {
		int n = str.length();
		char[] arr = str.toCharArray();

		for (int i = 0; i < n; i++) {

			if (arr[i] != ' ' && (i == 0 || arr[i - 1] == ' ')) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public void printFirstCharacterOfEachWord(String str) {
		// find length of string
		int n = str.length();

		// convert str to character array
		char[] arr = str.toCharArray();

		// loop through array
		for (int i = 0; i < n; i++) {

			// if current character is not space
			if (arr[i] != ' ') {
				// print first char
				if (i == 0) {
					System.out.println(arr[i]);

				}

				// is previous character space
				else if (arr[i - 1] == ' ') {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

}
