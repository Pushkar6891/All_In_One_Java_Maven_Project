package eg00917;

public class FactorialDemo {

	public static void main(String[] args) {

		FactorialDemo obj = new FactorialDemo();
		int n = 5;
		int result = obj.fact(n);
		System.out.println(result);
	}

	public int fact(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
