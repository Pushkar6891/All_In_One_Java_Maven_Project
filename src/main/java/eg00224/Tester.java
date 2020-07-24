package eg00224;

public class Tester {

	public static void main(String[] args) {

		Stock stock = new Stock();
		BuyOrder buyOrder = new BuyOrder(stock);
		SellOrder sellOrder = new SellOrder(stock);

		StockBroker stockBroker = new StockBroker();
		stockBroker.placeOrder(buyOrder);
		stockBroker.placeOrder(sellOrder);
		stockBroker.executeOrders();

	}

}
