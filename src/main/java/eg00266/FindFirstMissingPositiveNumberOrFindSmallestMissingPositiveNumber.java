package eg00266;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber {

	public static void main(String[] args) {

		FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber obj = new FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber();
		int[] arr = { -2, 11, 1, -3, 2, 8, 4 };
		int result1 = obj.smallestMissingPositiveNumber1(arr);
		System.out.println(result1 + " is smallest missing positive number");
		int result2 = obj.smallestMissingPositiveNumber2(arr);
		System.out.println(result2 + " is smallest missing positive number");
		int result3 = obj.smallestMissingPositiveNumber3(arr);
		System.out.println(result3 + " is smallest missing positive number");
		int result4 = obj.smallestMissingPositiveNumber4(arr);
		System.out.println(result4 + " is smallest missing positive number");
		int result5 = obj.smallestMissingPositiveNumber5(arr);
		System.out.println(result5 + " is smallest missing positive number");
	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public int smallestMissingPositiveNumber1(int[] arr) {
		if (arr.length == 0) {
			return 1;
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

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return arr.length + 1;
	}

	public int smallestMissingPositiveNumber2(int[] arr) {
		int found;
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			found = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					found = 1;
					break;
				}
			}

			if (found == 0) {
				return i;
			}
		}
		return -1;

	}

	// Time Complexity : O(n) for HashMap
	// Space Complexity : O(n) for HashMap
	public int smallestMissingPositiveNumber3(int[] arr) {
		int n = arr.length;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(arr[i], 1);
		}

		for (int i = 1; i < n + 1; i++) {
			if (map.containsKey(i) == false) {
				return i;
			}
		}
		return -1;
	}

	// Time Complexity : O(n) for HashMap
	// Space Complexity : O(n) for HashMap
	public int smallestMissingPositiveNumber4(int[] arr) {
		int n = arr.length;

		int[] aux = new int[20];
		Arrays.fill(aux, -1);

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0 && arr[i] <= n) {
				aux[arr[i] - 1] = arr[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (aux[i] != i + 1) {
				return i + 1;
			}
		}

		return -1;
	}

	// Time Complexity : O(n) for HashMap
	// Space Complexity : O(n) for HashMap
	public int smallestMissingPositiveNumber5(int[] arr) {
		int n = arr.length;

		int temp = 0;
		for (int i = 0; i < n; i++) {
			while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= n) {
				temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return -1;
	}
}
