package eg00703;

public class ReplaceCharacterInString {

	public static void main(String[] args) {

		ReplaceCharacterInString obj = new ReplaceCharacterInString();
		String str = "Hello World!! Welcome to Coding Simplified Out Of Box";
		char originalChar = 'o';
		char replacementChar = 'y';
		System.out.println("Original String :");
		System.out.println(str);
//		String replacedString = obj.replaceCharacter(str, originalChar, replacementChar);
		String replacedString = obj.replaceCharacteroByCharactery(str);
		System.out.println("Replaced String : ");
		System.out.println(replacedString);
	}

	public String replaceCharacter(String str, char originalChar, char replacementChar) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == originalChar) {
				arr[i] = replacementChar;
			}
		}

		String replacedString = new String(arr);
		return replacedString;
	}

	// For Replacing both uppercase and lowercase
	public String replaceCharacteroByCharactery(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 'o' || arr[i] == 'O') {
				arr[i] = 'y';
			}
		}

		String replacedString = new String(arr);
		return replacedString;
	}

}
