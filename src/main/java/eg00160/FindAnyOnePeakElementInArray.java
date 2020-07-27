package eg00160;

public class FindAnyOnePeakElementInArray {

	public static void main(String[] args) {

		FindAnyOnePeakElementInArray obj = new FindAnyOnePeakElementInArray();
		int[] arr1 = { 2, 3, 4, 7, 5, 10, 3 }; // peak : 7
//		int[] arr1 = { 2, 3, 4, 7, 5 }; // peak : 7
//		int[] arr = { 8, 7, 6, 5, 4 }; // peak : 8
//		int[] arr = {2,3,4,5,6}; // peak : 6
//		int[] arr = { 2, 2, 2, 2, 2 }; // peak : 2
		System.out.println("1.Using Linear Search");
		int result1 = obj.findPeakElementUsingLinearSearch(arr1);
		System.out.println(result1);
		System.out.println("\n2.Using Binary Search");
		int result2 = obj.findPeakElementUsingBinarySearch(arr1);
		System.out.println(result2);
	}

	// Complexity : O(n)
	public int findPeakElementUsingLinearSearch(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[i + 1]) {
				return arr[i];
			}
		}

		// return last element if all elements are sorted
		// return last element if one element is present in array
		return arr[n - 1];
	}

	// Complexity : O(logn)
	public int findPeakElementUsingBinarySearch(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
				return arr[mid];
			} else if (mid > 0 && arr[mid - 1] > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
