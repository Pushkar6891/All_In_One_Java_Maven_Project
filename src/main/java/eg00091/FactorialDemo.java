package eg00091;

public class FactorialDemo {

	public static void main(String[] args) {

		FactorialDemo obj = new FactorialDemo();
		int n = 6;
		int result = obj.fact(n);
		System.out.println(result);
	}

	public int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * fact(n-1);
	}

}
