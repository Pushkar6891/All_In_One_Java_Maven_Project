package eg01010;

import java.text.ParseException;
import java.util.Arrays;

public class StringTointArray {

	public static void main(String[] args) throws ParseException {

		StringTointArray obj = new StringTointArray();
		obj.convertStringTointArray();
	}

	public void convertStringTointArray() {

		String str = "9 8 2 6 3 9 6 4 6 5";
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			intArr[i]=Integer.parseInt(strArr[i]);
		}
		System.out.println(Arrays.toString(intArr));

	}

}
