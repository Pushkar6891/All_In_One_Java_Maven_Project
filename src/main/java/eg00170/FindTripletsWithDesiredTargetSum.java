package eg00170;

import java.util.Arrays;

public class FindTripletsWithDesiredTargetSum {

	public static void main(String[] args) {

		FindTripletsWithDesiredTargetSum obj = new FindTripletsWithDesiredTargetSum();
		int[] arr = { 0, -1, 2, -3, 1 };
		int targetSum = -2;
		obj.findTriplets(arr, targetSum);
	}

	// Complexity : O(n^3)
	public void findTriplets(int[] arr, int targetSum) {
		int n = arr.length;
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == targetSum) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						found = true;
					}
				}
			}
		}

		if (found == false) {
			System.out
					.println("No triplets found with targetSum : " + targetSum + " in array : " + Arrays.toString(arr));
		}
	}

}
