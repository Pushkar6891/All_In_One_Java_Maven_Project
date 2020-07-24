package eg00233;

public class CreditCardPayment implements PaymentMethodStrategy {

	private String cardHolderName;
	private String card;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardPayment() {
	}

	public CreditCardPayment(String cardHolderName, String card, String cvv, String dateOfExpiry) {
		super();
		this.cardHolderName = cardHolderName;
		this.card = card;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " is paid using credit card : " + card);
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

}
