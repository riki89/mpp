package standard_exam;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String accId;
	

	public CheckingAccount(String accId, double fee, double startBalance) {
		super();
		this.balance = startBalance;
		this.monthlyFee = fee;
		this.accId = accId;
	}

	@Override
	public String getAccountId() {
		return null;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return this.balance - this.monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthly) {
		this.monthlyFee = monthly;
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
