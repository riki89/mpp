package standard_exam;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accId;
	

	public SavingsAccount(String accId, double interestRate, double startBalance) {
		super();
		this.balance = startBalance;
		this.interestRate = interestRate;
		this.accId = accId;
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return this.balance + this.interestRate*this.balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
