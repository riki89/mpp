package standard_exam;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	
	public Employee(String name) {
		super();
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double totalBalance = 0;
		for (Account account : accounts) {
			totalBalance += account.computeUpdateBalance();
		}
		return totalBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}
}
