package lab3.lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;
	
	public Company(String name) {
		super();
		this.name = name;
		this.departments = new ArrayList<Department>();
	}


	public void addDepatment(Department dep)
	{
		departments.add(dep);
	}
	
	public List<Department> getDepartments()
	{
		return this.departments;
	}
	public void print()
	{
		System.out.println("** Name: "+this.name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void printHierarchy()
	{

		System.out.println("\n--------------COMPNAY----------------\n");
		print();
		for (Department dept : departments) {
			dept.print();
			System.out.println("\n------------------POSITIONS------------------\n");
			for (Position pos : dept.getPositions()) {
				pos.print();
				if (pos.getEmployee() != null)
				{
					System.out.println("\n----------------EMPLOYEE-----------------\n");
					pos.getEmployee().print();
				}
				
			}
			System.out.println("------------END DEPARTMENT------------");
		}

		System.out.println("---------------END COMPANY--------------");
	}
	
	/*Level 2*/
	public double getSalary()
	{
		double totalSalary = 0;
		for (Department department : departments) {
			totalSalary += department.getSalary();
		}
		return totalSalary;
	}
	
}
