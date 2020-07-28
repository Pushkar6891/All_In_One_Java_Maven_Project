package eg01009;

import java.text.ParseException;
import java.util.Arrays;

public class StringTocharArray {

	public static void main(String[] args) throws ParseException {

		StringTocharArray obj = new StringTocharArray();
		obj.convertStringTocharArrayUsingtoCharArray();
	}

	// 1. Using char[] charArray = str.toCharArray();
	public void convertStringTocharArrayUsingtoCharArray() {

		String str = "Hello";
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));

	}

}
