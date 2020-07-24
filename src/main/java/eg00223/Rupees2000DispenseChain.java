package eg00223;

public class Rupees2000DispenseChain implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		int factor = 2000;
		int amount = cur.getAmount();
		if (amount >= factor) {
			int num = amount / factor;
			int remainder = amount % factor;
			System.out.println("Dispensing " + num + " Rs " + factor + " note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
