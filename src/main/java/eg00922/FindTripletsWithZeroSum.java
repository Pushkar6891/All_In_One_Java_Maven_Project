package eg00922;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindTripletsWithZeroSum {

	public static void main(String[] args) {

		FindTripletsWithZeroSum obj = new FindTripletsWithZeroSum();
		int[] arr = { 0, -1, 2, -3, 1 };
		int targetSum = 0;
		System.out.println("Using 3 Nested For Loop : ");
		obj.findTripletsUsingNestedForLoop1(arr, targetSum);
		System.out.println("Using Set : ");
		obj.findTripletsUsingLinkedHashSet2(arr, targetSum);
		System.out.println("Using Sorting : ");
		obj.findTripletsUsingSorting3(arr, targetSum);
	}

	// Complexity : O(n^3)
	public void findTripletsUsingNestedForLoop1(int[] arr, int targetSum) {
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

	// Complexity : O(n^2)
	public void findTripletsUsingLinkedHashSet2(int[] arr, int targetSum) {
		int n = arr.length;
		boolean found = false;

		for (int i = 0; i < n - 1; i++) {
			// Find all pairs with sum equals to
			// "-arr[i]"
			HashSet<Integer> s = new LinkedHashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int x = -(arr[i] + arr[j]);
				if (s.contains(x)) {
					System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
					found = true;
				} else {
					s.add(arr[j]);
				}
			}
		}

		if (found == false) {
			System.out
					.println("No triplets found with targetSum : " + targetSum + " in array : " + Arrays.toString(arr));
		}
	}

	// Complexity : O(n^2)
	public void findTripletsUsingSorting3(int arr[], int targetSum) {
		int n = arr.length;
		boolean found = false;

		// sort array elements
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			// initialize left and right
			int l = i + 1;
			int r = n - 1;
			int x = arr[i];
			while (l < r) {
				if (x + arr[l] + arr[r] == 0) {
					// print elements if it's sum is zero
					System.out.print(x + " ");
					System.out.print(arr[l] + " ");
					System.out.println(arr[r] + " ");

					l++;
					r--;
					found = true;
				}

				// If sum of three elements is less
				// than zero then increment in left
				else if (x + arr[l] + arr[r] < 0)
					l++;

				// if sum is greater than zero than
				// decrement in right side
				else
					r--;
			}
		}

		if (found == false) {
			System.out
					.println("No triplets found with targetSum : " + targetSum + " in array : " + Arrays.toString(arr));
		}
	}

}
