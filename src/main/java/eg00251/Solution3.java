package eg00251;

//Java program to find maximum amount of water that can 
//be trapped within given set of bars. 

public class Solution3 {

	// Method for maximum amount of water
	public int getMaxTrappedWater(int[] a, int n) {
		int waterQty = 0;
		int maxLeft = 0;
		int maxNow = 0;
		int[] maxRight = new int[a.length];

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > maxNow) {
				maxNow = a[i];
				maxRight[i] = maxNow;
			} else {
				maxRight[i] = maxNow;
			}
		}

		for (int i = 0; i < a.length; i++) {
			waterQty = waterQty + Integer.max(Integer.min(maxLeft, maxRight[i]) - a[i], 0);
			if (a[i] > maxLeft) {
				maxLeft = a[i];
			}
		}
		return waterQty;
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		Solution3 obj = new Solution3();
		// int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		// int arr[] = { 2, 0, 2 };
		int arr[] = { 3, 0, 2, 0, 4 };
		int n = arr.length;
		System.out.println("Maximum water that can be accumulated is " + obj.getMaxTrappedWater(arr, n));
	}
}
