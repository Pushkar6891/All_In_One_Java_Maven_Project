package eg00233;

public class PaytmPayment implements PaymentMethodStrategy {

	private String mobile;

	public PaytmPayment() {
	}

	public PaytmPayment(String mobile) {
		super();
		this.mobile = mobile;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " is paid using paytm : " + mobile);
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
