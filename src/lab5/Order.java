package lab5;

import java.time.LocalDateTime;

public class Order {
	private String orderNo;
	private LocalDateTime orderDate;
	private double orderAmount;
	private Commissioned commissioned;
	
	public Order(String orderNo, LocalDateTime orderDate, double orderAmount, Commissioned commissioned) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Commissioned getCommissioned() {
		return commissioned;
	}

	public void setCommissioned(Commissioned commissioned) {
		this.commissioned = commissioned;
	}

}
