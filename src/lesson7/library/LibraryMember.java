package lesson7.library;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord checkoutRecord;
	
	public LibraryMember(String memberId, String firstName, String lastName, String phone) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		//this.checkoutRecord = checkoutRecors;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}
	public void setCheckoutRecord(CheckoutRecord checkoutRecors) {
		this.checkoutRecord = checkoutRecors;
	}
}
