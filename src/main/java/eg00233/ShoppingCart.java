package eg00233;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	
	public ShoppingCart() {
		productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	private int calculateTotalProductPrice() {
		
		// Old way
		/*
		int totalPrice = 0;
		for(Product product : productList) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
		*/
		
		// Using Java 8
		return productList.stream().map(p->p.getPrice()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMethodStrategy paymentMethodStrategy) {
		paymentMethodStrategy.pay(calculateTotalProductPrice());
	}
}
