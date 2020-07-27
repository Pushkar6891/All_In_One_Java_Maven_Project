package eg00159;

import java.util.Arrays;

public class DeleteAnElementFromArrayByValue {

	public static void main(String[] args) {

		DeleteAnElementFromArrayByValue obj = new DeleteAnElementFromArrayByValue();
		int[] arr = { 10, 40, 30, 80, 60, 20 };
		int key = 30;
		System.out.println("Original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Resultant Array :");
		System.out.println(Arrays.toString(obj.deleteElementByValue(arr, key)));
	}

	public int[] deleteElementByValue(int[] arr, int key) {
		int n = arr.length;
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (key == arr[i]) {
				// Swap remaining elements to deleted ekement position
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(key + " Element found in Array ");
		}else {
			System.out.println(key + " Element not found in Array ");
		}
		
		// Copy Elements to new Array
		int[] resultArr = new int[n - 1];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = arr[i];
		}

		return resultArr;
	}

}
