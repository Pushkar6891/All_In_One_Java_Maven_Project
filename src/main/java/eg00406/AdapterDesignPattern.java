package eg00406;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		ChromeDriver a = new ChromeDriver();
		a.getElement();
		a.selectElement();

		IEDriver e = new IEDriver();
		e.findElement();
		e.clickElement();

		WebDriver wID = new WebDriverAdapter(e);
		wID.getElement();
		wID.selectElement();

	}

}