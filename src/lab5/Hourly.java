package lab5;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;
	final int numberOfWeeks = 4;

	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	/*
	public void print()
	{
		super.print();
		System.out.print("Hourly wage: "+this.hourlyWage+" Hours per Week: "+this.hoursPerWeek);
	}
	*/
	
	@Override
	public double calcGrossPay(DateRange dr) {
		return this.hourlyWage * this.hoursPerWeek*numberOfWeeks;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	

}
