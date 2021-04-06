package lab3.lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private String title;
	private String description;
	private Department department;
	private Employee employee;
	
	//level 3
	private Position superior;
	private List<Position> inferiors;
	
	public Position(String title, String description, Department department) {
		super();
		this.title = title;
		this.description = description;
		this.department = department;
		this.inferiors = new ArrayList<Position>();
	}
	
	void print()
	{
		System.out.println("****** Title: "+this.title+" \n****** Description: "+this.description);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/*LEVEL 2*/
	public double getSalary()
	{
		if (this.getEmployee().equals(null))
			return 0;
		else 
			return this.getEmployee().getSalary();
	}
	
	/**LEVEL 3**/
	public void printDownLine(){
		this.print();
		if (!this.employee.equals(null))
		{
			System.out.print("  ");
			this.employee.print();	
		}
		
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	public List<Position> getInferiors() {
		return inferiors;
	}

	public void setInferiors(List<Position> inferiors) {
		this.inferiors = inferiors;
	}
	//Week 3 - day 1
//	@Override
//	public boolean equals(Object obj)
//	{
//		if (obj == null) return false;
//		if (obj.getClass() != getClass()) return false;
//		Position p = (Position)obj;
//		if (p.getTitle().equals(title) && p.getDescription().equals(description))
//			return true;
//		else return false;
//	}
	
	@Override
	public String toString() {
		return "[\tTitle: "+this.title+" \n\tDescription: "+this.description+"\n]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}
