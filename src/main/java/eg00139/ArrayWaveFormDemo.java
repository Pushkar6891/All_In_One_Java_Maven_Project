package eg00139;

import java.util.Arrays;

public class ArrayWaveFormDemo {

	public static void main(String[] args) {

		ArrayWaveFormDemo obj = new ArrayWaveFormDemo();
		// int[] arr = { 8, 1, 2, 3, 4, 5, 6, 4, 2 };
		int[] arr = { 10, 90, 49, 2, 1, 5, 23 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		obj.waveArray(arr, n);
		System.out.println(Arrays.toString(arr));
	}

	public void waveArray(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < n - 1; i = i + 2) {
			swap(arr, i, i + 1);
		}
	}

	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
// 1. Sort the array
// 2. Swap Odd Even elements to create a wave 
// where arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]
// https://www.geeksforgeeks.org/sort-array-wave-form-2/