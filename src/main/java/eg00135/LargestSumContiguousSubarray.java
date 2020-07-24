package eg00135;

import java.util.Arrays;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {

		LargestSumContiguousSubarray obj = new LargestSumContiguousSubarray();
		int[] a = { 1, -2, 3, 4, -4, 6, -4, 3, 2 };
		int n = a.length;
		int result = obj.maxSubArraySum(a,n);
		System.out.println(Arrays.toString(a) + " max sum is : " + result);
	}
	
	public int maxSubArraySum(int[] a, int n) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		for(int i=0;i<n;i++) {
			maxEndingHere += a[i];
			if(maxEndingHere<0) {
				// ignore if sum is negative and re-initialise
				maxEndingHere = 0;
			}
			if(maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
		}
		return maxSoFar;
	}

}
