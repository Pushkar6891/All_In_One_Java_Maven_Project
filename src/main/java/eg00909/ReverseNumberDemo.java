package eg00909;

public class ReverseNumberDemo {

	public static void main(String[] args) {

		ReverseNumberDemo obj = new ReverseNumberDemo();
		int n = 12345;
		int result = obj.reverseNumber(n);
		System.out.println(n);
		System.out.println(result);
	}

	public int reverseNumber(int n) {
		int temp = n;
		int r = 0;
		int s = 0;
		while (n > 0) {
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;
		}
		return s;
	}

}
