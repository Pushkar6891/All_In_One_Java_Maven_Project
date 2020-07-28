package eg01012;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayListOfString {

	public static void main(String[] args) throws ParseException {

		StringToArrayListOfString obj = new StringToArrayListOfString();
		obj.convertStringToArrayListOfStringUsingsplitAndEnhancedForLoop();
		obj.convertStringToArrayListOfStringUsingasListMethod();
	}

	public void convertStringToArrayListOfStringUsingsplitAndEnhancedForLoop() {

		String str = "22,33,44,55,66,77";
		String[] strArr = str.split(",");
		List<String> strList = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			strList.add(strArr[i]);
		}
		System.out.println(strList.toString());

	}

	public void convertStringToArrayListOfStringUsingasListMethod() {

		String str = "22,33,44,55,66,77";
		String[] strArr = str.split(",");
		List<String> strAsList = Arrays.asList(strArr);
		System.out.println(strAsList.toString());

	}

}
