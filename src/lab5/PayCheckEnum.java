package lab5;

public enum PayCheckEnum {
	FICA(0.23), STATE(0.05), LOCAL(0.01), MEDICARE(0.03), SSN(0.075);
	private double value;
	
	private PayCheckEnum(double val)
	{
		this.value = val;
	}

	public double getValue() {
		return value;
	}

}
