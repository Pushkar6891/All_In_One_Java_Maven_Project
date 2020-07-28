package eg00117;

import java.util.Arrays;

public class ReverseArrayBySwappingElementsDemo {

	public static void main(String[] args) {

		ReverseArrayBySwappingElementsDemo obj = new ReverseArrayBySwappingElementsDemo();

		String[] arr = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println("\n1. Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n2. Reverse Array by Sawpping");
		String[] result = obj.reverseArrayBySwapping(arr);
		System.out.println(Arrays.toString(result));
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
