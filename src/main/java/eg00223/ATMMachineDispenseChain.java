package eg00223;

public class ATMMachineDispenseChain {

	private DispenseChain moneyDispenseChain1;

	public ATMMachineDispenseChain() {
		moneyDispenseChain1 = new Rupees2000DispenseChain();

		DispenseChain moneyDispenseChain2 = new Rupees500DispenseChain();
		DispenseChain moneyDispenseChain3 = new Rupees200DispenseChain();
		DispenseChain moneyDispenseChain4 = new Rupees100DispenseChain();

		moneyDispenseChain1.setNextChain(moneyDispenseChain2);
		moneyDispenseChain2.setNextChain(moneyDispenseChain3);
		moneyDispenseChain3.setNextChain(moneyDispenseChain4);
	}

	public DispenseChain getMoneyDispenseChain1() {
		return moneyDispenseChain1;
	}

}
