package eg00117;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayByUsingInbuiltFunctionDemo {

	public static void main(String[] args) {

		ReverseArrayByUsingInbuiltFunctionDemo obj = new ReverseArrayByUsingInbuiltFunctionDemo();
		String[] arr = { "apple", "mango", "cherry", "kiwi", "banana" };
		System.out.println("\n1. Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n2. Reverse Array by Using Inbuilt Collections.reverse");
		String[] result = obj.reverseArrayUsingInbuiltFunction(arr);
		System.out.println(Arrays.toString(result));
	}

	public String[] reverseArrayUsingInbuiltFunction(String[] arr) {
		Collections.reverse(Arrays.asList(arr));
		return arr;
	}

}
