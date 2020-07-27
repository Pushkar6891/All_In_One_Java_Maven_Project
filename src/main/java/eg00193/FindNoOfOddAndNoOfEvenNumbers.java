package eg00193;

import java.util.Arrays;

public class FindNoOfOddAndNoOfEvenNumbers {

	public static void main(String[] args) {

		FindNoOfOddAndNoOfEvenNumbers obj = new FindNoOfOddAndNoOfEvenNumbers();
		int[] arr = { 9, 8, 2, 6, 3, 9, 6, 4, 6, 5 };
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		int[] result = obj.numberOfOddAndNumberOfEven(arr);
		System.out.println("No. of Odd Numbers : ");
		System.out.println(result[0]);
		System.out.println("No. of Even Numbers : ");
		System.out.println(result[1]);

	}

	public int[] numberOfOddAndNumberOfEven(int[] arr) {
		int n = arr.length;
		int oddCount = 0;
		int evenCount = 0;
		int[] result = new int[2];

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		result[0] = oddCount;
		result[1] = evenCount;

		return result;
	}

}
