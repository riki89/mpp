package lab5;

import java.util.Locale;

public final class PayCheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee employee;
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod, Employee emp) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
		this.employee = emp;
	}
	
	
	
	public void print()
	{
		System.out.printf(Locale.US, "Pay Period: %s\n  Gross Pay: $%,.2f\n  FICA: $%,.2f\n  STATE: $%,.2f \n  LOCAL: $%,.2f\n  MEDICARE: $%,.2f\n  SSN: $%,.2f\n  NetPay: $%,.2f\n"
				,this.payPeriod.toString()
				,this.grossPay
				,this.fica
				,this.state
				,this.local
				,this.medicare
				,this.socialSecurity
				,getNetPay());
	}
	
	public double getNetPay()
	{
		return this.grossPay - (this.fica + this.local + this.state + this.local + this.medicare + this.socialSecurity);
	}
	//
	public double getGrossPay() {
		return grossPay;
	}
	public double getFica() {
		return fica;
	}
	public double getState() {
		return state;
	}
	public double getLocal() {
		return local;
	}
	public double getMedicare() {
		return medicare;
	}
	public double getSocialSecurity() {
		return socialSecurity;
	}
	public DateRange getPayPeriod() {
		return payPeriod;
	}



	public Employee getEmployee() {
		return employee;
	}
}
