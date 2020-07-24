package eg00120;

public class CheckIfCharacterIsVowelOrConsonantDemo {

	public static void main(String[] args) {

		CheckIfCharacterIsVowelOrConsonantDemo obj = new CheckIfCharacterIsVowelOrConsonantDemo();
		char[] arr = { 'p', 'u', 's', 'h', 'k', 'a', 'r', 'c', 'h', 'a', 'u', 'h', 'a', 'n' };
		for (int i = 0; i < arr.length; i++) {
			boolean result = obj.isVowel(arr[i]);
			System.out.println(arr[i] + " " + result);
		}

	}

	public boolean isVowel(char c) {
		boolean flag = false;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int j = 0; j < vowels.length; j++) {
			if (c == vowels[j])
				flag = true;
		}

		return flag;
	}

}
