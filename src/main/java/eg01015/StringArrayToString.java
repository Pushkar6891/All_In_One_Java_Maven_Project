package eg01015;

import java.text.ParseException;

public class StringArrayToString {

	public static void main(String[] args) throws ParseException {

		StringArrayToString obj = new StringArrayToString();
		obj.convertStringToStringArrayUsingStringjoin();
		obj.convertStringToStringArrayUsingConcatenationAndForeach();
	}

	// 1. Using String newStr = String.join(" ",words)
	public void convertStringToStringArrayUsingStringjoin() {

		String[] strArr = { "I", "am", "Pushkar", "I", "am", "brown" };
		String joinedString = String.join(" ", strArr);
		System.out.println(joinedString);
		// System.out.println(joinedString instanceof String);
	}

	// 2. Using
	public void convertStringToStringArrayUsingConcatenationAndForeach() {

		String[] strArr = { "I", "am", "Pushkar", "I", "am", "brown" };
		String result = "";
		for (String value : strArr) {
			result = result + " " + value;
		}
		System.out.println(result);

	}

}
