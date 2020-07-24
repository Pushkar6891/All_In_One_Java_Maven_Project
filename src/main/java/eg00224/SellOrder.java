package eg00224;

public class SellOrder implements Order {

	private Stock stock;

	public SellOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sellStock();
	}

}
