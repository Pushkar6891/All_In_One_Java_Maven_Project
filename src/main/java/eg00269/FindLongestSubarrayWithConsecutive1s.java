package eg00269;

public class FindLongestSubarrayWithConsecutive1s {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };

		FindLongestSubarrayWithConsecutive1s obj = new FindLongestSubarrayWithConsecutive1s();
		int result = obj.longestSubArrayLengthWithConsecutive1s(arr);
		System.out.println(result);
	}

	public int longestSubArrayLengthWithConsecutive1s(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int n = arr.length;

		int count = 0; // intitialize count
		int result = 0; // initialize max

		for (int i = 0; i < n; i++) {

			// Reset count when 0 is found
			if (arr[i] == 0)
				count = 0;

			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			else {
				count++;// increase count
				result = Math.max(result, count);
			}
		}

		return result;
	}

}
