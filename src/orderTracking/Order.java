package orderTracking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderNumber;
	private boolean prepaid;
	private double orderPrice;
	private LocalDate orderDate;
	private String status;
	private ICustomer customer;
	private List<OrderLine> orderLines;
	
	public Order(String orderNumber, boolean prepaid, double orderPrice, LocalDate orderDate, String status,
			ICustomer customer) {
		super();
		this.orderNumber = orderNumber;
		this.prepaid = prepaid;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.status = status;
		this.customer = customer;
		this.orderLines = new ArrayList<OrderLine>();
	}

	public double getTotalPrice()
	{
		double totalPrice = 0;
		for (OrderLine orderLine : orderLines) {
			totalPrice += orderLine.getPrice();
		}
		return totalPrice;
	}
	
	public double getCustomerPoints()
	{
		return ((ACustomer) customer).getPoints();
	}
	
	public double getOrderPoints()
	{
		double totalPoints = 0;
		for (OrderLine orderLine : orderLines) {
			totalPoints += orderLine.getPoints();
		}
		return totalPoints;
	}
	
	public void setCustomerPoints()
	{
		for (OrderLine orderLine : orderLines) {
			((ACustomer) customer).setPoints(orderLine.computePoints());
		}
	}
	
	//gettes and setters
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public boolean isPrepaid() {
		return prepaid;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ICustomer getCustomer() {
		return customer;
	}

	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void addOrderLines(OrderLine orderLine) {
		this.orderLines.add(orderLine);
	}
	
	

}
