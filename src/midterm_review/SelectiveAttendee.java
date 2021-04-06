package midterm_review;

import java.util.ArrayList;
import java.util.List;

public class SelectiveAttendee extends Attendee {
	private List<Session> sessions;
	
	public SelectiveAttendee(String name, String adress) {
		super(name, adress);
		this.sessions = new ArrayList<Session>();
	}

	@Override
	public double getRegistrationFee() {
		double totalFee = 0;
		for (Session session : sessions) {
			totalFee += session.getSessionFee();
		}
		return totalFee;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void addSession(Session session) {
		this.sessions.add(session);
	}


	public double smallestFee()
	{
		double smallest = 0;
		if (this.sessions.size() > 0)
			this.sessions.get(0).getSessionFee();
		else 
			smallest = 10000000;
		for (Session session : sessions) {
			if (session.getSessionFee() < smallest)
			{
				smallest = session.getSessionFee();
			}
		}
		return smallest;
	}
	

}
