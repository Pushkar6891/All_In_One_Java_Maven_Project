package eg00393;

import java.util.Arrays;

public class Sort1ToN {

	public static void main(String[] args) {

		Sort1ToN obj = new Sort1ToN();
		int[] arr = { 8, -1, 6, 1, 9, 3, 2, 7, 4, -1 };
		System.out.println(Arrays.toString(arr));
		int[] sortedArray = obj.sort1ToN(arr);
		System.out.println(Arrays.toString(sortedArray));
	}

	// Complexity : Time Complexity : O(n)
	public int[] sort1ToN(int[] arr) {
		int n = arr.length;
		int curr = 0;
		int value = 0;
		int next = 0;

		for (int i = 0; i < n; i++) {
			curr = i;
			value = -1;

			// swap
			while (curr >= 0 && curr < n && arr[curr] != curr + 1) {
				next = arr[curr];
				arr[curr] = value;
				value = next;
				curr = next - 1;
			}
		}

		return arr;
	}

}
