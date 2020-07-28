package eg01011;

import java.text.ParseException;
import java.util.Arrays;

public class StringTodoubleArray {

	public static void main(String[] args) throws ParseException {

		StringTodoubleArray obj = new StringTodoubleArray();
		obj.convertStringTodoubleArray();
	}

	public void convertStringTodoubleArray() {

		String str = "9.0 8.9 2.8 6.7 3.6 9.5 6.4 4.3 6.2 5.1";
		String[] strArr = str.split(" ");
		double[] doubleArr = new double[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			doubleArr[i] = Double.parseDouble(strArr[i]);
		}
		System.out.println(Arrays.toString(doubleArr));

	}

}
