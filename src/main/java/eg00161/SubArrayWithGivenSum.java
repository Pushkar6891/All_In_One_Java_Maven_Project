package eg00161;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		LinkedListImplUsingArray obj = new LinkedListImplUsingArray();
		int arr[] = { 4, 2, 5, 3, 1, 8 };
		int sum = 11;
		obj.findSubArrayWithGivenSumForPositiveNumbers(arr, sum);

		int arr2[] = { 9, -2, 2, 6, 3 };
		int sum2 = 11;
		obj.findSubArrayWithGivenSum(arr2, sum2);

	}
}