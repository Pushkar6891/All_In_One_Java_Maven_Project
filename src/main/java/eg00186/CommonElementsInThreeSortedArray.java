package eg00186;

public class CommonElementsInThreeSortedArray {

	public static void main(String[] args) {
		// sorted array
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] arr3 = { 5, 10, 15, 20 };
		System.out.println("1. Using Way 1:");
		findCommonElementsInThreeSortedArray(arr1, arr2, arr3);
		System.out.println("\n2. Using Way 2:");
		findCommonElementsinSortedArray(arr1, arr2, arr3);
	}

	// O(n^3)
	public static void findCommonElementsInThreeSortedArray(int[] arr1, int[] arr2, int[] arr3) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.print(arr1[i] + " ");
					}
				}
			}
		}
	}

	// O(n)
	public static void findCommonElementsinSortedArray(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}
	}

}
