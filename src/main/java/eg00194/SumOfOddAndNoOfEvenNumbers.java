package eg00194;

import java.util.Arrays;

public class SumOfOddAndNoOfEvenNumbers {

	public static void main(String[] args) {

		SumOfOddAndNoOfEvenNumbers obj = new SumOfOddAndNoOfEvenNumbers();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4, 6, 5 };
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		int[] result = obj.numberAndSumOfOddAndNumberOfEven(arr);
		System.out.println("No. of Odd Numbers : ");
		System.out.println(result[0]);
		System.out.println("No. of Even Numbers : ");
		System.out.println(result[1]);
		System.out.println("Sum of Odd Numbers : ");
		System.out.println(result[2]);
		System.out.println("Sum of Even Numbers : ");
		System.out.println(result[3]);

	}

	public int[] numberAndSumOfOddAndNumberOfEven(int[] arr) {
		int n = arr.length;
		int oddCount = 0;
		int oddNoSum = 0;
		int evenCount = 0;
		int evenNoSum = 0;
		int[] result = new int[4];

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
				evenNoSum += arr[i];
			} else {
				oddCount++;
				oddNoSum += arr[i];
			}
		}

		result[0] = oddCount;
		result[1] = evenCount;
		result[2] = oddNoSum;
		result[3] = evenNoSum;

		return result;
	}

}
