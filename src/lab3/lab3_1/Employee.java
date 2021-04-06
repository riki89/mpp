package lab3.lab3_1;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	private Position position;
	private Department department;
	
	public Employee(String employeeId, String firstName, String middleInitial, String lastName, LocalDate birthDate,
			String sSN, double salary, Position position, Department dep) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
		this.position = position;
		this.department = dep;
	}
	
	public void print()
	{
		System.out.println("******** Employee ID: "+this.employeeId+" \n******** First Name: "+this.firstName+
				" \n******** Middle Initial: "+this.middleInitial+
				" \n******** Last Name: "+this.lastName+" \n******** Birth Date: "+this.birthDate+
				" \n******** SSN: "+this.SSN+" \n******** Salary: "+this.salary);
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
//		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
//		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
//		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//		result = prime * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(salary);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}

	
	//Week3 - Equals method
//	public boolean equals(Object obj)
//	{
//		//System.out.println("Equals method...");
//		if (obj == null) return false;;
//		if (obj.getClass() != getClass()) return false;
//		Employee e = (Employee)obj;
//		if (e.getEmployeeId().equals(employeeId) && e.getFirstName().equals(firstName) 
//				&& e.getLastName().equals(lastName) && e.getMiddleInitial().equals(middleInitial)
//				&& e.getBirthDate().equals(birthDate) && e.getSSN().equals(SSN) && e.getSalary() == salary
//			) return true;
//		else return false;
//		
//	}
	
	//toString
	@Override
	public String toString() {
		return "[ \tEmp ID: "+this.employeeId+" \n\tFirst Name: "+this.firstName+" \n\tMiddle Initial: "+this.middleInitial+
				" \n\tLast Name: "+this.lastName+" \n\tBirth Date: "+this.birthDate+"\n\tSSN:  "+this.SSN+"\n\tSalary: "+this.salary+"\n]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleInitial == null) {
			if (other.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(other.middleInitial))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(this, employeeId, firstName, middleInitial, lastName, birthDate, SSN, salary);
//	}

	
}
