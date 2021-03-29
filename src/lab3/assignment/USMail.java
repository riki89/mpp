package lab3.assignment;

public class USMail extends Carrier {
	final double rate = 0.55; 

	public USMail(String name, String description, double weight, String zone) {
		super(name, description, weight, zone);
	}
	
	public double computeCost()
	{
		if (getWeight() < 3 )
			return 1;
		else 
			return rate * getWeight();
	}

}
