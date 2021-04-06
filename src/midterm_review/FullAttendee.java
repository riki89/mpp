package midterm_review;

public class FullAttendee extends Attendee{
	private final double fee = 4000;

	public FullAttendee(String name, String adress) {
		super(name, adress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRegistrationFee() {
		// TODO Auto-generated method stub
		return this.fee;
	}
	

}
