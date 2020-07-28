package eg00266;

public class FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber {

	public static void main(String[] args) {

		FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber obj = new FindFirstMissingPositiveNumberOrFindSmallestMissingPositiveNumber();
		int[] arr = { -2, 11, 1, -3, 2, 8, 4 };
		int result = obj.smallestMissingPositiveNumber(arr);
		System.out.println(result + " is smallest missing positive number");
	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public int smallestMissingPositiveNumber(int[] arr) {
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

}
