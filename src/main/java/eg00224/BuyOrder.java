package eg00224;

public class BuyOrder implements Order {

	private Stock stock;

	public BuyOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buyStock();
	}

}
