package eg00233;

public class Tester {

	public static void main(String[] args) {

		ShoppingCart shoppingCart1 = new ShoppingCart();

		Product product1 = new Product("Soap", "11111", 100);
		Product product2 = new Product("Shampoo", "22222", 200);
		Product product3 = new Product("Biscuit", "33333", 50);
		Product product4 = new Product("Chips", "44444", 10);
		Product product5 = new Product("Brush", "55555", 20);

		shoppingCart1.addProduct(product1);
		shoppingCart1.addProduct(product2);
		shoppingCart1.addProduct(product3);
		shoppingCart1.addProduct(product4);
		shoppingCart1.addProduct(product5);

		CreditCardPayment creditCardPayment = new CreditCardPayment("Pushkar", "1234 5678 9101 1121", "678",
				"10/12/2024");
		shoppingCart1.payment(creditCardPayment);

		System.out.println("================================");

		ShoppingCart shoppingCart2 = new ShoppingCart();

		Product product6 = new Product("Rice", "66666", 1000);
		Product product7 = new Product("Wheat", "77777", 500);
		Product product8 = new Product("Milk", "88888", 20);
		Product product9 = new Product("Bread", "99999", 30);
		Product product10 = new Product("Earphone", "11112", 2000);

		shoppingCart2.addProduct(product6);
		shoppingCart2.addProduct(product7);
		shoppingCart2.addProduct(product8);
		shoppingCart2.addProduct(product9);
		shoppingCart2.addProduct(product10);

		PaypalPayment paypalPayment = new PaypalPayment("Pushkar", "98263 96465");
		shoppingCart2.payment(paypalPayment);

		System.out.println("================================");

		ShoppingCart shoppingCart3 = new ShoppingCart();

		Product product11 = new Product("Eggs", "22224", 200);
		Product product12 = new Product("Chicken", "22225", 400);
		Product product13 = new Product("Fish", "22226", 500);
		Product product14 = new Product("Dry Fruits", "22227", 1000);
		Product product15 = new Product("Ketchup", "22228", 200);

		shoppingCart3.addProduct(product11);
		shoppingCart3.addProduct(product12);
		shoppingCart3.addProduct(product13);
		shoppingCart3.addProduct(product14);
		shoppingCart3.addProduct(product15);

		PaytmPayment paytmPayment = new PaytmPayment("9826396465");
		shoppingCart3.payment(paytmPayment);

		System.out.println("================================");
	}

}
