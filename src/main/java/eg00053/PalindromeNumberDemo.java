package eg00053;

public class PalindromeNumberDemo {

	public static void main(String[] args) {

		PalindromeNumberDemo obj = new PalindromeNumberDemo();
		int[] arr = { 12321, 234432, 111, 235, 642, -121 };
		for (int i = 0; i < arr.length; i++) {
			boolean result = obj.isPalindromeNumber(arr[i]);
			System.out.println(arr[i] + " " + result);
		}

	}

	public boolean isPalindromeNumber(int n) {
		Integer num = Integer.valueOf(n);
		String str = num.toString();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
