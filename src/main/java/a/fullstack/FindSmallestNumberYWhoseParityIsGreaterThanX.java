package a.fullstack;

public class FindSmallestNumberYWhoseParityIsGreaterThanX {

	public static void main(String[] args) {

		FindSmallestNumberYWhoseParityIsGreaterThanX obj = new FindSmallestNumberYWhoseParityIsGreaterThanX();
		int x = 3;// 2
		int y = 4;// 3

		int findParity = obj.compareParity(2);
		System.out.println(findParity);
	}

	public int compareParity(int x) {

		for (int i = x; i <= x + 1000; i++) {
			int y = x++;
			if (findParity(x + 1) > findParity(y)) {
				return y;
			}
		}
		return 0;
	}
	
	public int findParity(int x) {
		int n = x;
		int parityCount = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				parityCount++;
			}
		}

		return parityCount;
	}



}
