package midterm_review;

import java.util.ArrayList;
import java.util.List;

public class Conference {
	private String name;
	private double fullConferenceFee;
	private List<IAttendee> attendees;
	
	public Conference(String name, double fullConferenceFee) {
		super();
		this.name = name;
		this.fullConferenceFee = fullConferenceFee;
		this.attendees = new ArrayList<IAttendee>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFullConferenceFee() {
		return fullConferenceFee;
	}
	public void setFullConferenceFee(double fullConferenceFee) {
		this.fullConferenceFee = fullConferenceFee;
	}
	public List<IAttendee> getAttendees() {
		return attendees;
	}
	public void addAttendee(IAttendee attendee) {
		if (this.attendees.equals(null))
			this.attendees = new ArrayList<IAttendee>();
		this.attendees.add(attendee);
	}
	
	public double getTotalPayments()
	{
		double totalPayments  = 0;
		for (IAttendee iAttendee : attendees) {
			totalPayments += iAttendee.getRegistrationFee();
		}
		return totalPayments;
	}

}
