package lab3.assignment;

public enum Zone {
	IA(0.35), TX(0.30), FL(0.55), Others(0.43);
	private double value;
	
	private Zone(double val)
	{
		this.value = val;
	}

	public double getValue() {
		return value;
	}
}
