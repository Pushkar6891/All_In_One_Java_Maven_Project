package eg00020;

// Finding Degree of Polynomial
public class TimeComplexityTester {

	public static void main(String[] args) {

		int n = 5;
		TimeComplexityTester obj = new TimeComplexityTester();
		System.out.println(obj.fun1(n));
		System.out.println(obj.fun2(n));
		System.out.println(obj.fun3(n));
		System.out.println(obj.fun4(n));
		System.out.println(obj.fun5(n));
		System.out.println(obj.fun6(n));
		System.out.println(obj.fun7(n));
	}

	// Time Complexity : O(n) : Linear Time : Single loop takes linear time
	public int fun1(int n) {
		int m = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			m += 1;
		}
		return m;
	}

	// Time Complexity : O(n^2) : Quadratic Time : Two Nested loop takes Quadratic
	// time
	public int fun2(int n) {
		int m = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m += 1;
			}
		}
		return m;
	}

	// Time Complexity : O(n+(n-1)+(n-2)) = O(n(n+1)/2) = O(n^2/2 + n/2) = O(n^2) :
	// Quadratic Time
	public int fun3(int n) {
		int m = 0;
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				m += 1;
			}
		}
		return m;
	}

	// Time Complexity : O(log(n)) : Logarithmic Time
	// Value of i is doubled every time.
	// Each time problem space is divided into half
	public int fun4(int n) {
		int m = 0;
		int i = 0;
		// if we start with 0 it will go in infinite loop
		for (i = 1; i < n; i = i * 2) {
			m += 1;
		}
		return m;
	}

	// Time Complexity : O(log(n)) : Logarithmic Time
	// Value of i is doubled every time.
	// Each time problem space is divided into half
	public int fun5(int n) {
		int m = 0;
		int i = 1; // if we start with 0 it will go in infinite loop as i=i*2 so 0=0*2
		while (i < n) {
			m += 1;
			i = i * 2;
		}
		return m;
	}

	// Time Complexity : O(log(n)) : Logarithmic Time
	// Value of i is doubled every time.
	// Each time problem space is divided into half
	public int fun6(int n) {
		int m = 0;
		int i = n;
		while (i > 0) {
			m += 1;
			i = i / 2;
		}
		return m;
	}

	// Time Complexity : O(n^3) : Cubic Time : Three Nested loop takes Quadratic
	// times
	public int fun7(int n) {
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				for (k = 0; k < n; k++) {
					m += 1;
				}
			}
		}
		return m;
	}

	// Time Complexity : O(n^2) + O(n^2) = O(n^2) : Two Nested Loop takes Quadratic
	// Time
	// times
	public int fun8(int n) {
		int m = 0;
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				m += 1;
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				m += 1;
			}
		}
		return m;
	}

	// Time Complexity : O(n^1)*O(n^1/2) = O(n^3/2) = Powers will add
	public int fun9(int n) {
		int m = 0;
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < Math.sqrt(n); j++) {
				m += 1;
			}
		}
		return m;
	}
}
