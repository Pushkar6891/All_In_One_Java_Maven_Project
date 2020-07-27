package eg00163;

public class FindTheMissingNumber {

	public static void main(String[] args) {

		FindTheMissingNumber obj = new FindTheMissingNumber();
//		int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		// System.out.println(obj.findMissingNumber(arr));
		System.out.println(obj.findMissingNumberUsingXOR(arr));
	}

	// If no. of elements in large this method will take more time
	public int findMissingNumber(int[] arr) {
		// 1. Calculate the num on n numbers
		int n = arr.length;
		int expected_total_sum = (n + 1) * (n + 2) / 2;
		int actual_total_sum = 0;
		for (int i = 0; i < n; i++) {
			actual_total_sum = actual_total_sum + arr[i];
		}

		int missing_element = expected_total_sum - actual_total_sum;
		return missing_element;
	}

	// XOR is commutative : a*b=b*a and a+b=b+a
	// XOR is associative : (a+b)+c=a+(b+c) and (a*b)*c=a*(b*c)
	// XOR : a^b=b^a
	public int findMissingNumberUsingXOR(int[] arr) {
		int n = arr.length;
		int xor1 = arr[0];
		int xor2 = 1;
		for (int i = 1; i < n; i++) {
			xor1 = xor1 ^ arr[i];
		}

		// Find max array element
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 2; i <= max; i++) {
			xor2 = xor2 ^ i;
		}

		int missing_element = xor1 ^ xor2;
		return missing_element;
	}

}
