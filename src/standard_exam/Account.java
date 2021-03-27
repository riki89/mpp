package standard_exam;

public abstract class Account {
	private Employee emp;
	public abstract String getAccountId();
	public abstract double getBalance();
	public abstract double computeUpdateBalance();

}
