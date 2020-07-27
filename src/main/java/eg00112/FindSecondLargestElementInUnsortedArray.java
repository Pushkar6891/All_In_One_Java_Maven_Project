package eg00112;

import java.util.Arrays;

public class FindSecondLargestElementInUnsortedArray {

	public static void main(String[] args) {

		FindSecondLargestElementInUnsortedArray obj = new FindSecondLargestElementInUnsortedArray();
		int[] arr = { 10, 80, 90, 60, 90, 30, 20 };
		int[] arr2 = { 10, 80, 90, 60, 30, 20 };
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n1. Second Largest in Duplicate Elements Array ");
		obj.findTopTwoLargestNumbers(arr);
		System.out.println("\n2. Second Largest in Distinct Elements Array");
		System.out.println(obj.findSecondLargestNumberUsingSortingOnUniqueElements(arr2));
	}

	
	
	public void findTopTwoLargestNumbers(int[] arr) {
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNum) {
				secondLargestNum = largestNum;
				largestNum = arr[i];
			} else if (arr[i] > secondLargestNum && largestNum != arr[i]) {
				secondLargestNum = arr[i];
			}
		}
		System.out.println("Largest : " + largestNum + " Second Largest : " + secondLargestNum);
	}

	// Works only for distinct elements
	public int findSecondLargestNumberUsingSortingOnUniqueElements(int[] arr) {
		int n = arr.length;
		if (n < 2) {
			System.out.println("Second Largest doest not exist");
		}

		Arrays.sort(arr);
		int secondLargest = arr[n - 2];

		return secondLargest;
	}

}
