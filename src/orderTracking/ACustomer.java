package orderTracking;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer{
	private String name;
	private String adress;
	private String phone;
	private double points;
	private List<Order> orders;
	
	public ACustomer(String name, String adress, String phone, double price) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.points = price;
		this.orders = new ArrayList<Order>();
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public double getPoints() {
		return points;
	}


	public void setPoints(double price) {
		this.points = price;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void addOrder(Order order) {
		this.orders.add(order);
	}


	@Override
	public abstract String getCreditRating();

}
