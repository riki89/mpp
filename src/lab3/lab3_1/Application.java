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
		
		
		company.printHierarchy();
		
	}
}
