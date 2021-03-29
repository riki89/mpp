package lab3.assignment;

public class UPS extends Carrier {
	final double rate = 0.45; 

	public UPS(String name, String description, double weight, String zone) {
		super(name, description, weight, zone);
	}
	@Override
	public double computeCost()
	{
		return rate * this.getWeight();
	}

}
