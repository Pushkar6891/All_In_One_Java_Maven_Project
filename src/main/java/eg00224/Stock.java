package eg00224;

public class Stock {

	private String stockName = "Google Share";
	private int stockQuantity = 20;

	public void buyStock() {
		System.out.println("Stock Name : " + stockName + " and Quantity : " + stockQuantity + " bought");
	}

	public void sellStock() {
		System.out.println("Stock Name : " + stockName + " and Quantity : " + stockQuantity + " sold");
	}
}
