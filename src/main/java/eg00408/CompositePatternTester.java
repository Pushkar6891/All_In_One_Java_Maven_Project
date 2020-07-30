package eg00408;

public class CompositePatternTester {

	public static void main(String[] args) {
		CompositeAccount component = new CompositeAccount();

		component.addAccount(new DepositeAccount("DA001", 100));
		component.addAccount(new DepositeAccount("DA002", 150));
		component.addAccount(new SavingAccount("SA001", 200));

		float totalBalance = component.getBalance();
		System.out.println("Total Balance : " + totalBalance);
	}

}