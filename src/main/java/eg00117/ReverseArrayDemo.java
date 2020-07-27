package eg00117;

import java.util.Arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {

		ReverseArrayDemo obj = new ReverseArrayDemo();
		String[] arr1 = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println("\n1. Original Array :");
		System.out.println(Arrays.toString(arr1));
		System.out.println("\n2. Reverse Array by Copying to New Array");
		String[] result1 = obj.reverseArrayByCopyingToNewArray(arr1);
		System.out.println(Arrays.toString(result1));

		String[] arr2 = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println("\n1. Original Array :");
		System.out.println(Arrays.toString(arr2));
		System.out.println("\n2. Reverse Array by Sawpping");
		String[] result2 = obj.reverseArrayBySwapping(arr2);
		System.out.println(Arrays.toString(result2));
	}

	public String[] reverseArrayByCopyingToNewArray(String[] arr) {
		String[] reversedArray = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[arr.length - i - 1];
		}
		return reversedArray;
	}

	public String[] reverseArrayBySwapping(String[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		return arr;
	}

}
