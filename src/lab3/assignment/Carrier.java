package lab3.assignment;

public class Carrier implements ICarrier{
	private String name;
	private IPackage ipackage;
	
	public Carrier(String name, IPackage ipackage) {
		super();
		this.name = name;
		this.ipackage = ipackage;
	}
	
	@Override
	public double computeCost()
	{
		double cost = 0;
		//System.out.println("Carrier name: "+this.name);
		switch (this.name) {
		case "UPS":
			cost = 0.45 * ((Package) this.ipackage).getWeight();
			break;
		case "US Mail":
			if ( ((Package) this.ipackage).getWeight() < 3)
				cost = 1.0;
			else 
				cost = 0.55;
			break;
		case "FedEx":
			double numberOfPound = ((Package) this.ipackage).getWeight();
			switch (((Package) this.ipackage).getZone()) {
			case "IA":
				cost = Zone.IA.getValue() * numberOfPound;
				break;
			case "TX":
				cost = Zone.TX.getValue() * numberOfPound;
				break;
			case "FL":
				cost = Zone.FL.getValue() * numberOfPound;
				break;
			case "Others":
				cost = Zone.Others.getValue() * numberOfPound;
				break;
			}
			break;
		}
		//System.out.println("Compute cost: "+cost);
		return cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IPackage getIpackage() {
		return ipackage;
	}

	public void setIpackage(IPackage ipackage) {
		this.ipackage = ipackage;
	}

}
