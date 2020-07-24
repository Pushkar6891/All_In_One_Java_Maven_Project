package eg00233;

public class Product {

	private String name;
	private String productCode;
	private int price;

	public Product() {
	}

	public Product(String name, String productCode, int price) {
		super();
		this.name = name;
		this.productCode = productCode;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
