package extra_credit.theater;

public class Seat {
	Person person;
	int row;
	int column;
	double price = 12;
	boolean reserved;
	
	double computeTotalCost() {
		return price +( 0.05 * price);
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isReserved() {
		return reserved;
	}

	public Seat(Person person, int row, int column) {
		super();
		this.person = person;
		this.row = row;
		this.column = column;
		this.price = 12;
		this.reserved = false;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	@Override
	public String toString() {
		return "Seat [person=" + person + ", row=" + row + ", column=" + column + ", price=" + price + ", reserved="
				+ reserved + "]";
	}
	

}
