package eg00021;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int key = 100;
		int arr[] = { -22, -9, 99, -7, 33, 55, 100, 120, 66, -200, -300 };
		int n = arr.length;
		LinearSearch obj = new LinearSearch();
		int index = obj.linearSearch(arr, key, n);
		if (index != -1) {
			System.out.println(key + " found at position " + (index + 1));
		} else {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		}
	}

	// Complexity O(n)
	public int linearSearch(int[] arr, int key, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
