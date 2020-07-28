package eg00716;

public class CompareTwoStringsWithBackspaceCharacters {

	public static void main(String[] args) {

// # is called backspace character

//		String str1 = "bcd##e";
//		String str2 = "bd#e";

//		String str1 = "abc##a";
//		String str2 = "addd###a";

		String str1 = "Mum#sBa##ic";
		String str2 = "Muss#ic";

		CompareTwoStringsWithBackspaceCharacters obj = new CompareTwoStringsWithBackspaceCharacters();
		boolean ifStringEqualContainingBackspace = obj.ifStringEqualContainingBackspace(str1, str2);
		System.out.println(ifStringEqualContainingBackspace);
	}

	public boolean ifStringEqualContainingBackspace(String str1, String str2) {
		int end1 = str1.length() - 1;
		int end2 = str2.length() - 1;

		while (end1 >= 0 && end2 >= 0) {
			int str1Index = getChar(str1, end1);
			int str2Index = getChar(str2, end2);

			if (str1Index < 0 && str2Index < 0) {
				return true;
			}

			if (str1Index < 0 || str2Index < 0) {
				return false;
			}

			if (str1.charAt(str1Index) != str2.charAt(str2Index)) {
				return false;
			}

			end1 = str1Index - 1;
			end2 = str2Index - 1;
		}

		return true;
	}

	public int getChar(String str, int end) {
		int specialChar = 0;

		while (end >= 0) {
			if (str.charAt(end) != '#') {
				if (specialChar == 0) {
					return end;
				} else {
					specialChar--;
				}
			} else {
				specialChar++;
			}

			end--;
		}

		return end;
	}

}
