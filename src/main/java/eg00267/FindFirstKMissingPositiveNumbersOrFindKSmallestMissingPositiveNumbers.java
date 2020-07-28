package eg00267;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstKMissingPositiveNumbersOrFindKSmallestMissingPositiveNumbers {

	public static void main(String[] args) {

		FindFirstKMissingPositiveNumbersOrFindKSmallestMissingPositiveNumbers obj = new FindFirstKMissingPositiveNumbersOrFindKSmallestMissingPositiveNumbers();
		int[] arr = { -2, 11, 1, -3, 2, 8, 4 };
		int k = 5;
		int[] resultArr = obj.firstKMissingPositiveNumbers(arr, k);
		System.out.println(Arrays.toString(resultArr));
	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public int[] firstKMissingPositiveNumbers(int[] arr, int k) {
		if (arr.length == 0 || k < 1) {
			return null;
		}

		int i = 0;
		while (i < arr.length) {
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
				int otherIndex = arr[i] - 1;

				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			} else {
				i++;
			}
		}

		List<Integer> missing = new ArrayList<Integer>();

		Set<Integer> otherNumber = new HashSet<Integer>();

		for (i = 0; i < arr.length & missing.size() < k; i++) {
			if (arr[i] != i + 1) {
				missing.add(i + 1);
				otherNumber.add(arr[i]);
			}
		}

		for (int j = i; missing.size() < k; j++) {

			if (!otherNumber.contains(j + 1)) {
				missing.add(j + 1);
			}
		}

		int temp = 0;
		int[] missingArr = new int[missing.size()];
		for (temp = 0; temp < missing.size(); temp++) {
			missingArr[temp] = missing.get(temp);
		}
		return missingArr;
	}
}
