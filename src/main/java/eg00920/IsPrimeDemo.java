package eg00920;

public class IsPrimeDemo {

	public static void main(String[] args) {

		IsPrimeDemo obj = new IsPrimeDemo();
		int n = 7;
		boolean result = obj.isPrime(n);
		System.out.println(result);
	}

	public boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
