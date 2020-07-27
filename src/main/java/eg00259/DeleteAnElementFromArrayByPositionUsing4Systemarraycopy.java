package eg00259;

//Java program to remove an element 
//from a specific index from an array 

import java.util.Arrays;

public class DeleteAnElementFromArrayByPositionUsing4Systemarraycopy {

	// Function to remove the element
	public static int[] removeTheElement(int[] arr, int index) {

		// If the array is empty
		// or the index is not in array range
		// return the original array
		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		// Create another array of size one less
		int[] anotherArray = new int[arr.length - 1];

		// Copy the elements from starting till index
		// from original array to the other array
		System.arraycopy(arr, 0, anotherArray, 0, index);

		// Copy the elements from index + 1 till end
		// from original array to the other array
		System.arraycopy(arr, index + 1, anotherArray, index, arr.length - index - 1);

		// return the resultant array
		return anotherArray;
	}

	// Driver Code
	public static void main(String[] args) {
		// Get the array
		int[] arr = { 1, 2, 3, 4, 5 };

		// Print the resultant array
		System.out.println("Original Array: " + Arrays.toString(arr));

		// Get the specific index
		int index = 2;

		// Print the index
		System.out.println("Index to be removed: " + index);

		// Remove the element
		arr = removeTheElement(arr, index);

		// Print the resultant array
		System.out.println("Resultant Array: " + Arrays.toString(arr));
	}
}
