package eg01013;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringToHashSetOfString {

	public static void main(String[] args) throws ParseException {

		StringToHashSetOfString obj = new StringToHashSetOfString();
		obj.convertStringToHashSetOfStringUsingsplitAndEnhancedForLoop();
		obj.convertStringToHashSetOfStringUsingasListMethod();
	}

	// 1. Using split and Enhanced For Loop
	public void convertStringToHashSetOfStringUsingsplitAndEnhancedForLoop() {

		String str = "22,33,44,33,66,11,99,77,44,77,22,11,33,44,55,66,77";
		String[] strArr = str.split(",");
		Set<String> strSet = new HashSet<>();
		for (int i = 0; i < strArr.length; i++) {
			strSet.add(strArr[i]);
		}
		System.out.println(strSet.toString());

	}

	// 2. Using Set<String> strAsSet = new HashSet<>(Arrays.asList(strArr));
	public void convertStringToHashSetOfStringUsingasListMethod() {

		String str = "22,33,44,33,66,11,99,77,44,77,22,11,33,44,55,66,77";
		String[] strArr = str.split(",");
		Set<String> strAsSet = new HashSet<>(Arrays.asList(strArr));
		System.out.println(strAsSet.toString());

	}

}
