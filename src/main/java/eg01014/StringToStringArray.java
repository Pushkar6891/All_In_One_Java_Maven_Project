package eg01014;

import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToStringArray {

	public static void main(String[] args) throws ParseException {

		StringToStringArray obj = new StringToStringArray();
		obj.convertStringToStringArrayUsingsplit();
		obj.convertStringToStringArrayByPassingStringToStringArrayConstructor1();
		obj.convertStringToStringArrayByPassingStringToStringArrayConstructor2();
		obj.convertStringToStringArrayByPassingStringToStringArrayConstructor3();
		obj.convertStringToStringArrayUsingPatternsplit();
	}

	// 1. Using String[] strArr = str.split(" ");
	public void convertStringToStringArrayUsingsplit() {

		String str = "I am Pushkar I am brown";
		String[] strArr = str.split(" ");
		System.out.println(Arrays.toString(strArr));

	}

	// 2. Using String[] strArr = new String[] { str };
	public void convertStringToStringArrayByPassingStringToStringArrayConstructor1() {

		String str = "I am Pushkar I am brown";
		String[] strArr = new String[] { str };
		System.out.println(Arrays.toString(strArr));

	}

	// 3. Using String[] strArr = new String[] { new String(str) };
	public void convertStringToStringArrayByPassingStringToStringArrayConstructor2() {

		String str = "I am Pushkar I am brown";
		String[] strArr = new String[] { new String(str) };
		System.out.println(Arrays.toString(strArr));

	}

	// 4. Using String[] strArr = new String[] { str, middleName, lastname };
	public void convertStringToStringArrayByPassingStringToStringArrayConstructor3() {

		String str = "I am Pushkar I am brown";
		String middleName = "Singh";
		String lastname = "Chauhan";
		String[] strArr = new String[] { str, middleName, lastname };
		System.out.println(Arrays.toString(strArr));
	}

	// 5. Using Pattern.split()
	public void convertStringToStringArrayUsingPatternsplit() {

		String str = "I am Pushkar I am brown";
		Pattern pattern = Pattern.compile(" ");
		String[] strArr = pattern.split(" ");
		System.out.println(Arrays.toString(strArr));
	}

	// 6. Using String newStr = String.join(" ",words)
	public void convertStringToStringArray() {

		String str = "I am Pushkar I am brown";
		String joinedString = String.join(" ", str);
		System.out.println(joinedString);
	}

}
