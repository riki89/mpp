package orderTracking;

import java.time.LocalDate;
import java.util.List;

public class OrderLine {
	private int quantity;
	private double price;
	private String status;
	private LocalDate shipDate;
	private double points;
	private Order order;
	private List<IProduct> products;
	
	public OrderLine(int quantity, double price, String status, LocalDate shipDate, double points, Order order) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.shipDate = shipDate;
		this.points = points;
		this.order = order;
	}
	
	public OrderLine(int quantity, double price, String status, LocalDate shipDate, double points) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.shipDate = shipDate;
		this.points = points;
	}

	void addPorduct(IProduct p)
	{
		this.products.add(p);
	}
	
	public List<IProduct> getProducts()
	{
		return this.products;
	}
	
	public double computePrice()
	{
		double totalPrice = 0;
		for (IProduct iProduct : products) {
			totalPrice += iProduct.getPrice();
		}
		return totalPrice;
	}
	
	public double computePoints()
	{
		double totalPoint = 0;
		for (IProduct iProduct : products) {
			for (ICompPoints icompPoint : ((Product) iProduct).getCompPoints()) {
				totalPoint += icompPoint.getPoints();
			}
		}
		return totalPoint;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
