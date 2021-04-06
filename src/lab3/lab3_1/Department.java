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
	
	/**Level 2**/
	public double getSalary()
	{
		double totalSalary = 0;
		for (Position position : positions) {
			totalSalary += position.getSalary();
		}
		return totalSalary;
	}

	/*LEVEL 3*/
	/*
	public void printReportingHierarchy()
	{
		System.out.println("HEAD OF DEPARTMENT");
		for (Position position : positions) {
			if (position.)
		}
		System.out.print("  ");
	}
	*/
	
	//Week 3 - day 1
	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (obj.getClass() != getClass()) return false;
		Department dep = (Department)obj;
		if (dep.getName().equals(name) && dep.getLocation().equals(location))
			return true;
		else return false;
	}
	
	//toString
	@Override
	public String toString() {
		return "[\tName: "+this.name+" \n\tLocation: "+this.location+"\n]";
	}
//	
//	private String name;
//	private String location;
}
