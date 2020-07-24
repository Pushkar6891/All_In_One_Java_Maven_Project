package eg00233;

public class PaypalPayment implements PaymentMethodStrategy {

	private String email;
	private String password;

	public PaypalPayment() {
	}

	public PaypalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " is paid using paypal");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
