package eg00107;

import java.util.Arrays;

public class SmallestNumberDemo {

	public static void main(String[] args) {

		SmallestNumberDemo obj = new SmallestNumberDemo();
		int[] arr = { 9, 8, 3, 2, 55, 3, -1, 8, 12, 4, 56 };
		int result = obj.findSmallest(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}

	public int findSmallest(int[] arr) {
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
