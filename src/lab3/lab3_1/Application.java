package lab3.lab3_1;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		Company company = new Company("Miscrosof");
		Department dep1 = new Department("Sales", "Los Angeles", company);
		Department dep2 = new Department("Marketing", "Chicago", company);
		company.addDepatment(dep1);
		company.addDepatment(dep2);
		
		Position dept1Developer = new Position("Developer", "Software Developement", dep1);
		Position dept1Sales = new Position("Sales", "Product sales", dep1);
		Position dept1Marketing = new Position("Marketing", "Product Marketing", dep1);
		
		Position dept2Developer = new Position("Developer", "Software Developement", dep2);
		Position dept2Sales = new Position("Sales", "Product sales", dep2);
		Position dept2Marketing = new Position("Marketing", "Product Marketing", dep2);
		
		dep1.addPosition(dept1Developer);
		dep1.addPosition(dept1Sales);
		dep1.addPosition(dept1Marketing);
		
		dep2.addPosition(dept2Developer);
		dep2.addPosition(dept2Sales);
		dep2.addPosition(dept2Marketing);
		
		Employee empDevDept1 = new Employee("101", "Ahmet", "AT", "Tayeb", LocalDate.of(1990, 1, 1), "123-299443", 5000, dept1Developer, dep1);
		Employee empSaleDept1 = new Employee("102", "Iman", "IT", "Taraabt", LocalDate.of(1990, 1, 1), "123-244393", 3000, dept1Developer, dep1);
		Employee empMarketDept1 = new Employee("103", "Joseph", "JL", "Lermann", LocalDate.of(1990, 1, 1), "123-559393", 2000, dept1Marketing, dep1);
		
		Employee empDevDept2 = new Employee("201", "Morsi", "MA", "Ahmed", LocalDate.of(1990, 1, 1), "123-2995663", 2500, dept2Developer, dep1);
		
		Employee empSaleDept2 = new Employee("202", "Khaled", "KA", "Tafer", LocalDate.of(1990, 1, 1), "123-27893", 3000, dept2Sales, dep2);
		Employee empMarketDept2 = new Employee("203", "Yahia", "YD", "Diallo", LocalDate.of(1990, 1, 1), "123-659393", 5000, dept2Marketing, dep2);
		Employee empDevDept3 = new Employee("301", "John", "Moroni", "Salves", LocalDate.of(1990, 1, 1), "123-784843", 4000, dept2Developer, dep2);
		Employee empMarketDept3 = new Employee("303", "Monee", "MB", "Ba", LocalDate.of(1990, 1, 1), "123-678933", 5500, dept1Sales, dep2);

		//employee for department 1
		dept1Developer.setEmployee(empDevDept1);
		dept1Developer.setEmployee(empSaleDept1);
		dept1Marketing.setEmployee(empMarketDept1);
		
		//employee for department 2
		dept2Sales.setEmployee(empSaleDept2);
		
		dept2Developer.setEmployee(empDevDept2);
		dept2Developer.setEmployee(empDevDept3);
		
		dept2Marketing.setEmployee(empMarketDept2);
		dept2Marketing.setEmployee(empMarketDept3);
		
		//week 3 - test equals method inside employee
		//Question 1
		//expected result: test 1: false
		System.out.println("test 1: "+empDevDept1.equals(empMarketDept3));
		Employee empTest = new Employee("101", "Ahmet", "AT", "Tayeb", LocalDate.of(1990, 1, 1), "123-299443", 5000, dept1Developer, dep1);
		//expected result: test 2: true
		System.out.println("test 2: "+empDevDept1.equals(empTest));
		
		//Question 2
		//POSITION - equals method overriden
		//expected result: test 3: false
		System.out.println("test 3: "+dept1Developer.equals(dept1Marketing));
		Position posTest = new Position("Developer", "Software Developement", dep1);
		//expected result: test 4: true
		System.out.println("test 4: "+dept1Developer.equals(posTest));
		
		//Question 3
		Department depTest = new Department("Sales", "Los Angeles", company);
		//expected result: test 5: false
		System.out.println("test 5 - equals departments: "+dep1.equals(dep2));
		//expected result: test 4: true
		System.out.println("test 4 - different departments: "+dep1.equals(depTest));
						
		
		//Question 4
		//Test toString method
		//Employee
		System.out.println(empTest.toString());
		//Question 5
		//Position
		System.out.println(posTest.toString());
		//Question 6
		//Department
		System.out.println(depTest.toString());
		
		//Question 7
		//hashCode
		//Expected result for 2 equals employees
		int result1 = empDevDept1.hashCode();
		int result2 = empTest.hashCode();
		System.out.println("HashCode1: "+result1+" - HashCode2: "+result2);
		//different employee
		System.out.println("HashCode1: "+result1+" - HashCode3: "+empMarketDept3.hashCode());
		
		//Question 8
		System.out.printf("   EQUALS POSITIONS: Postion1 [HashCode: %d] - Positon 2[HASHCODE: %d] \n", dep1.hashCode(), depTest.hashCode());
		System.out.printf("DIFFERENT POSITIONs: Postion1 [HashCode: %d] - Positon 2[HASHCODE: %d] \n", dep1.hashCode(), dep2.hashCode());
		
		//company.printHierarchy();
		
	}
}
