package eg00024;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int key = 100;
		int arr[] = { -22, -9, 99, -7, 33, 55, 100, 120, 66, -200, -300 };
		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(arr, 0, arr.length - 1, key);
		if (index != -1) {
			System.out.println(key + " found at position " + (index + 1));
		} else {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		}
	}

	public int binarySearch(int[] arr, int low, int high, int key) {
		Arrays.sort(arr);
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				return binarySearch(arr, low, mid - 1, key);
			} else if (key > arr[mid]) {
				return binarySearch(arr, mid + 1, high, key);
			}
		}
		return -1;

	}

}
