package eg00724;

public class ReverseVowelsOrderInString {

	public static void main(String[] args) {

		ReverseVowelsOrderInString obj = new ReverseVowelsOrderInString();
//		String str = "equation";
//		String str = "cauliflower";
//		String str = "education";
		String str = "telecommunication";
		System.out.println("Original String : ");
		System.out.println(str);
		String reverseVowelsInString = obj.reverseVowelsInString(str);
		System.out.println("\nAfter Reverse : ");
		System.out.println(reverseVowelsInString);
	}

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U')
			return true;

		return false;
	}

	public String reverseVowelsInString(String str) {
		int start = 0;
		int end = str.length() - 1;

		char[] charArr = str.toCharArray();

		while (start < end) {
			if (!isVowel(charArr[start])) {
				start++;
				continue;
			}

			if (!isVowel(charArr[end])) {
				end--;
				continue;
			}

			char c = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = c;

			start++;
			end--;
		}

		return String.valueOf(charArr);
	}

}

// Input  : equation -> order of vowels -> [e u a i o] -> after reverse -> [o i a u e]
// Output : oqiatuen -> [o i a u e]

//Input  : cauliflower -> order of vowels -> [a u i o e] -> after reverse -> [e o i u a]
//Output : ceolifluwar -> [e o i u a]

//Input  : education -> order of vowels -> [e u a i o] -> after reverse -> [o i a u e]
//Output : odicatuen -> [e o i u a]

//Input  : telecommunication -> order of vowels -> [e u a i o] -> after reverse -> [o i a u e]
//Output : tolicamminucoteen -> [o i a u e]