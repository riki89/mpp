package midterm_review;

public class Application {

	public static void main(String[] args) {
		Conference myConference = new Conference("My Conference", 2000.0);
		System.out.println("Total parments: "+ myConference.getTotalPayments());

	}

}
