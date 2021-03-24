package lab3.lab3_1;

public class Position {
	private String title;
	private String description;
	private Department department;
	private Employee employee;
	
	public Position(String title, String description, Department department) {
		super();
		this.title = title;
		this.description = description;
		this.department = department;
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

}
