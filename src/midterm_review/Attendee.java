package midterm_review;

public abstract class Attendee implements IAttendee {
	private String name;
	private String adress;
	
	public Attendee(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public abstract double getRegistrationFee();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
