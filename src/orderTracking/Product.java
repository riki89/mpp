package orderTracking;

import java.util.ArrayList;
import java.util.List;

public class Product implements IProduct{
	private String description;
	private String productNumber;
	private double price;
	private List<ICompPoints> compPoints;
	
	public Product(String description, String productNumber, double price) {
		super();
		this.description = description;
		this.productNumber = productNumber;
		this.price = price;
		this.compPoints = new ArrayList<ICompPoints>();
	}


	@Override
	public double getPrice() {
		return this.price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProductNumber() {
		return productNumber;
	}


	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<ICompPoints> getCompPoints() {
		return compPoints;
	}


	public void addCompPoints(ICompPoints compPoints) {
		this.compPoints.add(compPoints);
	}
	

}
