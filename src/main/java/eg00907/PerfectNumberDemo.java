package eg00907;

public class PerfectNumberDemo {

	public static void main(String[] args) {

		PerfectNumberDemo obj = new PerfectNumberDemo();
		for (int i = 1; i <= 10000; i++) {
			boolean result = obj.isPerfectNumber(i);
			if (result) {
				System.out.println(i);
			}
		}
	}

	public boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
			if (sum == n) {
				return true;
			}
		}

		return false;
	}

}
