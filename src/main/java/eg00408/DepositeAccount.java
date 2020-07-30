package eg00408;

public class DepositeAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public DepositeAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() {
		return accountBalance;
	}

}