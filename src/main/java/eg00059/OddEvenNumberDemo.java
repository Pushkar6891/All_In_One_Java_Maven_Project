package eg00059;

public class OddEvenNumberDemo {

	public static void main(String[] args) {

		OddEvenNumberDemo obj = new OddEvenNumberDemo();
		int[] arr = { 22, 7, 6, 33, 192, 3123, 58578 };
		for (int i = 0; i < arr.length; i++) {
			String result = obj.isOddOrEven(arr[i]);
			System.out.println(arr[i] + " " + result);
		}

	}

	public String isOddOrEven(int n) {
		if (n % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
