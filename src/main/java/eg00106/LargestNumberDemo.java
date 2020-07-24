package eg00106;

import java.util.Arrays;

public class LargestNumberDemo {

	public static void main(String[] args) {

		LargestNumberDemo obj = new LargestNumberDemo();
		int[] arr = { 9, 8, 3, 2, 55, 3, -1, 8, 12, 4, 56 };
		int result = obj.findLargest(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}

	public int findLargest(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
