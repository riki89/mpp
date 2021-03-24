package lab3.lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private Company company;
	private List<Position> positions;
	
	public Department(String name, String location, Company company) {
		super();
		this.name = name;
		this.location = location;
		this.company = company;
		this.positions = new ArrayList<Position>();
	}
	
	public void print()
	{
		System.out.println("**** Name: "+this.name+ " \n****Location: "+this.location);
	}
	public void addPosition(Position pos)
	{
		positions.add(pos);
	}
	public List<Position> getPositions()
	{
		return this.positions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
