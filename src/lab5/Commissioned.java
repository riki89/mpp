package lab5;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commision;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commision, double baseSalary) {
		super(empId);
		this.commision = commision;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		double totalAmount = this.baseSalary;
		for (Order order : orders) {
			if (dr.isInRange(order.getOrderDate()))
				totalAmount += order.getOrderAmount()*this.commision;
		}
		return totalAmount;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}
	

}
