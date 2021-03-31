package lab5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee hourly = new Hourly("1001", 120, 40);
		Employee salaried = new Salaried("1002", 90000);
		Employee commissioned = new Commissioned("1003", 0.07, 11000);
		
		Order o1 = new Order("od1", LocalDateTime.now(), 960, (Commissioned) commissioned);
		Order o2 = new Order("od2", LocalDateTime.now(), 645, (Commissioned) commissioned);
		Order o3 = new Order("od3", LocalDateTime.now(), 750, (Commissioned) commissioned);
		
		((Commissioned) commissioned).getOrders().add(o1);
		((Commissioned) commissioned).getOrders().add(o2);
		((Commissioned) commissioned).getOrders().add(o3);
		
		employees.add(hourly);
		employees.add(salaried);
		employees.add(commissioned);
		
		for (Employee employee : employees) {
			System.out.print("Employee: "+employee.getEmpId()+" - ");
			PayCheck pc = employee.calcCompensation(3, 2021);
			pc.print();
		}
	}

}
