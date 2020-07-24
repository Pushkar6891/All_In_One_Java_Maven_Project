package eg00235;

public class Tester {

	public static void main(String[] args) {

		Tester obj = new Tester();
		Item[] items = new Item[4];
		items[0] = new Book("Core Java", "8234", 450.0);
		items[1] = new Book("Hibernate", "8234", 700.0);
		items[2] = new Fruit("Mango", 2, 100.0);
		items[3] = new Fruit("Apple", 3, 200.0);

		double totalCostOfShopping = obj.calculateTotalCost(items);
		System.out.println("Total Shopping Cost: " + totalCostOfShopping);
	}

	public double calculateTotalCost(Item[] items) {
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		for (Item item : items) {
			totalCost += item.accept(shoppingCartVisitor);
		}
		return totalCost;
	}

}
