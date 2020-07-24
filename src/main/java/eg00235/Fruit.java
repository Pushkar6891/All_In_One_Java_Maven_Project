package eg00235;

public class Fruit implements Item {

	private String name;
	private int weight;
	private double pricePerKg;

	public Fruit() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public Fruit(String name, int weight, double pricePerKg) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
