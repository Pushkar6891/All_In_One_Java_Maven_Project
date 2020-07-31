package eg00903;

import java.util.Scanner;

public class PrintPythagoreanPrimeNumbersTester {

	public static void main(String[] args) {
		PrintPythagoreanPrimeNumbersTester obj = new PrintPythagoreanPrimeNumbersTester();
		Scanner sc = new Scanner(System.in);
		System.out.println("To print pythagorean prime numbers between start and end");
		System.out.println("Enter start range : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.println("Enter end range : ");
		int end = Integer.parseInt(sc.nextLine());
		obj.printPythagoreanPrime(start, end);
	}

	public void printPythagoreanPrime(int start, int end) {
		for(int i=start;i<=end;i++) {
			if (isPythagoreanPrime(i)) {
				System.out.println(i);
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
