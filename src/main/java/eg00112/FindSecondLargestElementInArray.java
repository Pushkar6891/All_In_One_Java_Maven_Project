package eg00112;

import java.util.Arrays;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {

		FindSecondLargestElementInArray obj = new FindSecondLargestElementInArray();
		int[] arr = { 10, 80, 90, 60, 90, 30, 20 };
		System.out.println(Arrays.toString(arr));
		obj.findTopTwoLargestNumbers(arr);
	}

	public void findTopTwoLargestNumbers(int[] arr) {
		int firstLargestNum = 0;
		int secondLargestNum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargestNum) {
				secondLargestNum = firstLargestNum;
				firstLargestNum = arr[i];
			} else if (arr[i] > secondLargestNum && firstLargestNum!=arr[i]) {
				secondLargestNum = arr[i];
			}
		}
		System.out.println(firstLargestNum + " " + secondLargestNum);
	}

}
