package eg00268;

public class FindLongestSubarrayWithAll1sIfMaxk0swith1s {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 1, 1, 1, 0 };
		int k = 2;

		FindLongestSubarrayWithAll1sIfMaxk0swith1s obj = new FindLongestSubarrayWithAll1sIfMaxk0swith1s();
		int result = obj.longestSubArrayLengthWithAll1sWithKAllowedToReplace(arr, k);
		System.out.println(result);
	}

	public int longestSubArrayLengthWithAll1sWithKAllowedToReplace(int[] arr, int k) {
		if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
			return -1;
		}

		int maxLength = 0;
		int start, end;
		start = end = 0;
		int numberOfZero = 0;

		while (end < arr.length) {
			if (arr[end] == 0) {
				numberOfZero++;
			}

			if (numberOfZero > k) {
				if (arr[start] == 0) {
					numberOfZero--;
				}

				start++;
			}

			maxLength = Math.max(end - start + 1, maxLength);
			end++;
		}

		return maxLength;
	}

}
