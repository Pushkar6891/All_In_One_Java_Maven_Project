package eg00118;

public class SumOfArrayElementsDemo {

	public static void main(String[] args) {

		SumOfArrayElementsDemo obj = new SumOfArrayElementsDemo();
		int[] arr = { 5, 3, 1, 9, 7, 8, 2, 4, 6, 0 };
		int result = obj.sumOfElements(arr);
		System.out.println(result);
	}

	public int sumOfElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
