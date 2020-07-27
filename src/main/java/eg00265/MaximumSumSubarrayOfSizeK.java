package eg00265;

import java.util.Arrays;

public class MaximumSumSubarrayOfSizeK {

	public static void main(String[] args) {

		MaximumSumSubarrayOfSizeK obj = new MaximumSumSubarrayOfSizeK();
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 5;
//		int[] arr = { 1, 4, 0, 0, 3, 10, 5 };
//		int k = 7;
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		String result = obj.findMaximumSubArraySumKadanesAlgorithm(arr);
		String[] resultArr = result.split(" ");
		int startIndex = Integer.parseInt(resultArr[0]);
		int endIndex = Integer.parseInt(resultArr[1]);
		int maxSumSubarray = Integer.parseInt(resultArr[2]);

		System.out.println("\n1. Maximum Sub Array Sum : ");
		System.out.println(maxSumSubarray);
		System.out.println("\nSubarray : ");
		System.out.print("[");
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println("\n\nStart Index : ");
		System.out.println(startIndex);
		System.out.println("\nEnd Index : ");
		System.out.println(endIndex);

		System.out.println("\n2. Maximum Sub Array Sum : ");
		System.out.println(obj.findMaximumSubArraySumKadanesAlgorithm2(arr));

		System.out.println("\n1. Using Brute Force");
		System.out.println(obj.findMaximumSubArrayUsingBruteForce(arr, k));

		System.out.println("\n2.Using Sliding Window");
		System.out.println(obj.findMaximumSubArrayUsingSlidingWindow(arr, k));
	}

	// Complexity : O(n*k)
	// Finding sum of all the subarrays and return max Sum
	public int findMaximumSubArrayUsingBruteForce(int[] arr, int k) {
		int maxSum = 0;
		int n = arr.length;
		for (int i = 0; i < n - k; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

	// Complexity : O(n)
	public int findMaximumSubArrayUsingSlidingWindow(int[] arr, int k) {
		int start = 0;
		int sum = 0;
		int maxSum = 0;
		int n = arr.length;
		for (int end = 0; end < n; end++) {
			sum += arr[end];
			if (end >= k - 1) {
				maxSum = Math.max(sum, maxSum);
				sum -= arr[start];
				start++;
			}
		}
		return maxSum;
	}

	public String findMaximumSubArraySumKadanesAlgorithm(int[] arr) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		int n = arr.length;
		int s = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {
			max_ending_here = max_ending_here + arr[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}

		String result = start + " " + end + " " + max_so_far;
		return result;
	}

	// Complexity : O(n)
	public int findMaximumSubArraySumKadanesAlgorithm2(int[] arr) {
		int maxSum = arr[0];
		int sum = arr[0];
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (sum < 0) {
				sum = arr[i];
			} else {
				sum += arr[i];
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

}
