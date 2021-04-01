package lab5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private String empId;
	private List<PayCheck> paycheck;
	
	public Employee(String empId) {
		super();
		this.empId = empId;
		this.paycheck = new ArrayList<PayCheck>();
	}

	public void print()
	{
		System.out.print("Emp ID: "+this.empId);
	}
	
	public PayCheck calcCompensation(int month, int year)
	{
		LocalDate startDate = LocalDate.of(year, month, 1);
		YearMonth ym = YearMonth.from(startDate);
		LocalDate endDate = ym.atEndOfMonth();
		DateRange dr = new DateRange(startDate.atStartOfDay(), endDate.atStartOfDay());
		
		double grossSalary = calcGrossPay(dr);
		
		PayCheck p = new PayCheck(grossSalary, 
				PayCheckEnum.FICA.getValue()*grossSalary, PayCheckEnum.STATE.getValue()*grossSalary,
				PayCheckEnum.LOCAL.getValue()*grossSalary, PayCheckEnum.MEDICARE.getValue()*grossSalary,
				PayCheckEnum.SSN.getValue()*grossSalary, dr, this);
		return p;
	}
	
	public abstract double calcGrossPay(DateRange dr);

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<PayCheck> getPaycheck() {
		return paycheck;
	}

	public void addPaycheck(PayCheck paycheck) {
		this.paycheck.add(paycheck);
	}
	

}
