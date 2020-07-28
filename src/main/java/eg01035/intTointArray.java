package eg01035;

import java.util.Arrays;

public class intTointArray {

	public static void main(String[] args) {

		intTointArray obj = new intTointArray();
		obj.convertintTointArrayUsingIntegertoString();
		obj.convertintTointArrayUsingForeach();
	}

	// 1. Using Java 8 int[] intArr = Integer.toString(i).chars().map(c -> c -
	// '0').toArray();
	public void convertintTointArrayUsingIntegertoString() {
		int i = 1234567890;
		int[] intArr = Integer.toString(i).chars().map(c -> c - '0').toArray();
		System.out.println(Arrays.toString(intArr));
	}

	// 2. Using int -> String -> charArr -> intArr
	public void convertintTointArrayUsingForeach() {
		int i = 1234567890;
		Integer intVal = new Integer(i);
		String strVal = intVal.toString();
		char[] charArr = strVal.toCharArray();
		int[] intArr = new int[charArr.length];
		System.out.println(Arrays.toString(intArr));
		for (int k = 0; k < charArr.length; k++) {
			intArr[k] = Character.getNumericValue(charArr[k]);
		}
		System.out.println(Arrays.toString(intArr));
	}

}
