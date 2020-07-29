package eg00023;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int key = 100;
		int arr[] = { -22, -9, 99, -7, 33, 55, 100, 120, 66, -200, -300 };
		int n = arr.length;
		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(arr, key, n);
		if (index != -1) {
			System.out.println(key + " found at position " + (index + 1));
		} else {
			System.out.println(key + " not found in array " + Arrays.toString(arr));
		}
	}

	public int binarySearch(int[] arr, int key, int n) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else if (key < arr[mid]) {
				high = mid - 1;
			}
		}
		return -1;

	}

}
