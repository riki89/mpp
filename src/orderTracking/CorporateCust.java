package orderTracking;

public class CorporateCust extends ACustomer{
	private String creditRating;
	private double creditLimit;

	public CorporateCust(String name, String adress, String phone, double price, String creditRating, double creditLimit) {
		super(name, adress, phone, price);
		this.creditRating = creditRating;
		this.creditLimit = creditLimit;
	}
	
	public void generateMonthlyBill()
	{
		
	}

	@Override
	public String getCreditRating() {
		// TODO Auto-generated method stub
		return this.creditRating;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	

}
