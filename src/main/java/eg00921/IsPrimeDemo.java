package eg00921;

public class IsPrimeDemo {

	public static void main(String[] args) {

		IsPrimeDemo obj = new IsPrimeDemo();
		int N = 100;
		for(int i=2;i<N;i++) {
			boolean result = obj.isPrime(i);
			if(result)
			System.out.println(i);
		}
		
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
