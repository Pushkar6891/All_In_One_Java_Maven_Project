package eg00224;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

	private List<Order> orderList = new ArrayList<>();

	public void placeOrder(Order order) {
		orderList.add(order);
	}

	public void executeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
