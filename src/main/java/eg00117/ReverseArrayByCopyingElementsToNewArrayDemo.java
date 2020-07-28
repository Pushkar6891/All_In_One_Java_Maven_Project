package eg00117;

import java.util.Arrays;

public class ReverseArrayByCopyingElementsToNewArrayDemo {

	public static void main(String[] args) {

		ReverseArrayByCopyingElementsToNewArrayDemo obj = new ReverseArrayByCopyingElementsToNewArrayDemo();
		String[] arr = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println("\n1. Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n2. Reverse Array by Copying to New Array");
		String[] result = obj.reverseArrayByCopyingToNewArray(arr);
		System.out.println(Arrays.toString(result));
	}

	public String[] reverseArrayByCopyingToNewArray(String[] arr) {
		String[] reversedArray = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[arr.length - i - 1];
		}
		return reversedArray;
	}

}
