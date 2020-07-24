package eg00098;

import java.util.Arrays;

public class AreTwoStringsAnagramDemo {

	public static void main(String[] args) {

		AreTwoStringsAnagramDemo obj = new AreTwoStringsAnagramDemo();
		obj.isAnagramBySortingLogic("abc", "bca");
		obj.isAnagramBySortingLogic("restful", "fluster");
		obj.isAnagramBySortingLogic("restful", "fluser");
		obj.isAnagramBySortingLogic("forty five", "over fifty");
	}

	public void isAnagramBySortingLogic(String inputText1, String inputText2) {

		String s1 = convertInputToLowerCaseAndRemoveSpaces(inputText1);
		String s2 = convertInputToLowerCaseAndRemoveSpaces(inputText2);

		boolean flag = true;
		if (s1.length() != s2.length()) {
			flag = false;
		}

		s1 = sortInputString(s1);
		s2 = sortInputString(s2);

		flag = s1.equals(s2);

		areStringsAnagram(inputText1, inputText2, flag);
	}

	public String convertInputToLowerCaseAndRemoveSpaces(String str) {
		return str.toLowerCase().replaceAll("\\s+", "");
	}

	public String sortInputString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public void areStringsAnagram(String inputText1, String inputText2, boolean flag) {
		if (flag) {
			System.out.println(inputText1 + " " + inputText2 + " are anagrams");
		} else {
			System.out.println(inputText1 + " " + inputText2 + " are not anagrams");
		}
	}

}
