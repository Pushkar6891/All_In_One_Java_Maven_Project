package eg00001;

import java.util.Arrays;

public class CountSortDemo {

	public static void main(String[] args) {

		CountSortDemo obj = new CountSortDemo();
		int[] arr = { 2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9 };
		System.out.println(Arrays.toString(arr));
		int[] result = obj.countSort(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] countSort(int[] arr) {
		// k is the max element in arr
		// range is from min to max
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int range = max - min + 1;
		int[] count = new int[range];
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			result[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
		return arr;
	}

}
