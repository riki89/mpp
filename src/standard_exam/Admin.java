package standard_exam;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double totalBalance = 0;
		for (Employee employee : list) {
			totalBalance += employee.computeUpdatedBalanceSum();
		}
		return totalBalance;
	}
}
