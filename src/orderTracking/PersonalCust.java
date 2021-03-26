package orderTracking;

public class PersonalCust extends ACustomer{
	private String creditRating;
	private String creditCard;
	
	public PersonalCust(String name, String adress, String phone, double price, String creditRating, String creditCard) {
		super(name, adress, phone, price);
		this.creditRating = creditRating;
		this.creditCard = creditCard;
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	

}
