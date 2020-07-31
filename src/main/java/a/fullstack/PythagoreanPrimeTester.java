package a.fullstack;

import java.util.Scanner;

public class PythagoreanPrimeTester {

	public static void main(String[] args) {
		PythagoreanPrimeTester obj = new PythagoreanPrimeTester();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		for (int i = 0; i < n; i++) {
			if (obj.isPythagoreanPrime(arr[i])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public boolean isPythagoreanPrime(int n) {
		if (isPrime(n) && ((n % 4) == 1)) {
			return true;
		}
		return false;
	}

	public boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
//I/P
//2
//5
//6

//O/P
//YES
//NO