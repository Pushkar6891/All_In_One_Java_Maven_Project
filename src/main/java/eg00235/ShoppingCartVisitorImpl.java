package eg00235;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {
		double finalBooksCost = 0.0;
		if (book.getPrice() > 500) {
			finalBooksCost = book.getPrice() - 100;
		} else {
			finalBooksCost = book.getPrice();
		}
		System.out.println("Book: " + book.getName() + ",book isbn : " + book.getIsbnNumber() + ",final books cost: "
				+ finalBooksCost);
		return finalBooksCost;
	}

	@Override
	public double visit(Fruit fruit) {
		double finalFruitsCost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit: " + fruit.getName() + ",final fruits cost: " + finalFruitsCost);
		return finalFruitsCost;
	}

}
