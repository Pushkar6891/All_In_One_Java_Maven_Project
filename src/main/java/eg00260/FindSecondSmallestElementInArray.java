package eg00260;

import java.util.Arrays;

public class FindSecondSmallestElementInArray {

	public static void main(String[] args) {

		FindSecondSmallestElementInArray obj = new FindSecondSmallestElementInArray();
		int[] arr = { 10, 80, 90, 60, 90, 30, 20 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Using Way 1: ");
		obj.findTopTwoSmallestNumbers1(arr);
		System.out.println("Using Way 2: ");
		obj.findTopTwoSmallestNumbers2(arr);
	}

	public void findTopTwoSmallestNumbers1(int[] arr) {
		int firstSmallestNum = Integer.MAX_VALUE;
		int secondSmallestNum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmallestNum) {
				secondSmallestNum = firstSmallestNum;
				firstSmallestNum = arr[i];
			} else if (arr[i] < secondSmallestNum && firstSmallestNum != arr[i]) {
				secondSmallestNum = arr[i];
			}
		}
		System.out.println(firstSmallestNum + " " + secondSmallestNum);
	}

	public void findTopTwoSmallestNumbers2(int[] arr) {
		int firstSmallestNum = Integer.MAX_VALUE;
		int secondSmallestNum = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstSmallestNum) {
				firstSmallestNum = arr[i];
			} else if (arr[i] > firstSmallestNum && arr[i] < secondSmallestNum) {
				secondSmallestNum = arr[i];
			}
		}
		System.out.println(firstSmallestNum + " " + secondSmallestNum);
	}

}
