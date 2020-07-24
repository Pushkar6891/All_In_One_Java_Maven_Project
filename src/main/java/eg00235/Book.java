package eg00235;

public class Book implements Item {

	private String name;
	private String isbnNumber;
	private double price;

	public Book() {
	}

	public Book(String name, String isbnNumber, double price) {
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
