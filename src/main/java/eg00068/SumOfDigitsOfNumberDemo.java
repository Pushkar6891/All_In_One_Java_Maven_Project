package eg00068;

public class SumOfDigitsOfNumberDemo {

	public static void main(String[] args) {

		SumOfDigitsOfNumberDemo obj = new SumOfDigitsOfNumberDemo();
		int n = 123456789;
		int result = obj.sumOfDigits(n);
		System.out.println(n + " sum of digits is : " + result);
	}

	public int sumOfDigits(int n) {
		int s = 0;
		int r = 0;
		if (n > 0) {
			while (n != 0) {
				r = n % 10;
				s = s + r;
				n = n / 10;
			}
			return s;
		}
		return -1;
	}

}
