package lab3.assignment;

import java.util.ArrayList;
import java.util.List;

public class Package implements IPackage {
	private String zone;
	private String description;
	private double weight;
	private List<ICarrier> carriers;

	public Package(String zone, String description, double weight) {
		super();
		this.zone = zone;
		this.description = description;
		this.weight = weight;
		this.carriers = new ArrayList<ICarrier>();
	}

	@Override
	public double computeLowestCost() {
		if (carriers.isEmpty())
			return 0.0;
		double lowest = carriers.get(0).computeCost();
		for (ICarrier iCarrier : carriers) {
			double tmp = iCarrier.computeCost();
			if (tmp < lowest)
			{
				lowest = tmp;
			}
		}
		return lowest;
	}
	
	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
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


	public List<ICarrier> getCarriers() {
		return carriers;
	}


	public void addCarrier(ICarrier carrier) {
		this.carriers.add(carrier);
	}

}
