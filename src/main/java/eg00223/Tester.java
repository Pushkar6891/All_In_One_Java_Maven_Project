package eg00223;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		ATMMachineDispenseChain atmMachineDispenseChain = new ATMMachineDispenseChain();

		Scanner sc = null;
		// int[] arr = { 100, 200, 300, 400, 500, 600, 1000, 1500, 2000, 10000, 15000,
		// 21000, 23000, 24000 };
		int amount = 0;
		while (true) {

			// for (int i = 0; i < arr.length; i++) {
			// System.out.println();
			// amount = arr[i];

			try {

				System.out.println("Enter amount to withdraw/dispense: ");
				sc = new Scanner(System.in);
				amount = sc.nextInt();
				if (amount % 100 != 0) {
					System.out.println("Amount must be in multiple of Rs 100");
					return;
				} else {
					DispenseChain dispenseChain1 = atmMachineDispenseChain.getMoneyDispenseChain1();
					Currency currency = new Currency(amount);
					dispenseChain1.dispense(currency);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// }
		}
	}

}