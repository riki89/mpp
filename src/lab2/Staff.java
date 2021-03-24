package lab2;

import java.util.ArrayList;

public class Staff extends Person {
	private double salary;
	private ArrayList<Course> courses;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		this.courses = new ArrayList<Course>();
	}

	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
