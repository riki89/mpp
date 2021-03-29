package lab3.assignment;

import java.util.ArrayList;
import java.util.List;

public class Carrier implements ICarrier{
	private String name;
	private String description;
	private double weight;
	private String zone;
	private List<ICarrier> carriers;
	
	public Carrier(String name, String description, double weight, String zone) {
		super();
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.zone = zone;
		this.carriers = new ArrayList<ICarrier>();
	}
	
	public void addCarrier(ICarrier c)
	{
		this.carriers.add(c);
	}
	
	public List<ICarrier> getCarriers()
	{
		return this.carriers;
	}

	@Override
	public double computeCost()
	{
		return 0.0;
	}
	
	public double lowestCost()
	{
		double lowest = this.carriers.get(0).computeCost();
		this.setName(((Carrier) this.carriers.get(0)).getName());
		
		for (ICarrier carrier : carriers) {
			if (carrier.computeCost() < lowest)
			{
				this.setName(((Carrier) carrier).getName());
				lowest = carrier.computeCost();
			}
		}
		return lowest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
