package standard_exam.stream_lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		//return table.keySet().stream().filter(n -> !socSecNums.contains(n)).collect(Collectors.toList());
		//return table.keySet().stream().filter(n -> !socSecNums.stream().anyMatch(a -> a.equals(n))).collect(Collectors.toList());
//		table.keySet().stream().forEach(System.out::println);
//		System.out.println();
//		socSecNums.forEach(System.out::println);
		return table.keySet().stream().filter(n -> !socSecNums.contains(n)).collect(Collectors.toList());
		
				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
//		return table.entrySet().stream().filter(e -> socSecNums.contains(e.getValue().getSsn()) && table.get(e.getValue().getSsn()).getSalary() > 80000)
//				.map(Map.Entry::getValue)
//				.collect(Collectors.toList());
		
//		return table.entrySet().stream().filter(e -> socSecNums.contains(e.getValue().getSsn()) && e.getValue().getSalary() > 80000)
//				.map(Map.Entry::getValue)
//				.collect(Collectors.toList());
		return table.values().stream().filter(e -> socSecNums.contains(e.getSsn()) && e.getSalary() > 80000)
				.collect(Collectors.toList());
			
	}
}