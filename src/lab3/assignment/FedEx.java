package lab3.assignment;

public class FedEx extends Carrier {
	private double zoneRate = Zone.Others.getValue(); 

	public FedEx(String name, String description, double weight, String zone) {
		super(name, description, weight, zone);
	}
	
	public double computeCost()
	{
		return getZoneRate(getZone()) * this.getWeight();
	}

	public double getZoneRate(String zone) {
		switch(zone)
		{
		case "IA", "MT", "OR", "CA":
			setZoneRate(Zone.IA.getValue());
			break;
		case "TX", "UT":
			setZoneRate(Zone.TX.getValue());
			break;
		case "FL", "MA", "OH":
			setZoneRate(Zone.FL.getValue());
			break;
		default:
			setZoneRate(Zone.Others.getValue());
			break;
		}
		return zoneRate;
	}

	public void setZoneRate(double zoneRate) {
		this.zoneRate = zoneRate;
	}

}
