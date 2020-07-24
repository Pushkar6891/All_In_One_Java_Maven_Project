package eg00117;

import java.util.Arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {

		ReverseArrayDemo obj = new ReverseArrayDemo();
		String[] arr = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println(Arrays.toString(arr));
		String[] result = obj.reverseArray(arr);
		System.out.println(Arrays.toString(result));
	}

	public String[] reverseArray(String[] arr) {
		String[] reversedArray = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[arr.length - i - 1];
		}
		return reversedArray;
	}

}
