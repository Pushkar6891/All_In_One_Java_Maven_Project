package eg00022;

import java.util.Arrays;

public class LinearSearchUsingRecursionDemo {

	public static void main(String[] args) {

		int key = 100;
		int arr[] = { -22, -9, 99, -7, 33, 55, 100, 120, 66, -200, -300 };
		int startIndex = 0;
		int lastIndex = arr.length;
		LinearSearchUsingRecursionDemo obj = new LinearSearchUsingRecursionDemo();
		int index = obj.linearSearch(arr, startIndex, lastIndex, key);
		if (index != -1) {
			System.out.println(key + " found at position " + (index + 1));
		} else {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		}
	}

	// Complexity O(n)
	public int linearSearch(int[] arr, int startIndex, int lastIndex, int key) {
		if (lastIndex < startIndex)
			return -1;
		if (arr[startIndex] == key)
			return startIndex;
		return linearSearch(arr, startIndex + 1, lastIndex, key);
	}

}
