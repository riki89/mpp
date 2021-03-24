package lab2;

import java.util.ArrayList;

public class Faculty extends Person {
	private double salary;
	private ArrayList<Course> courses;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		this.courses = new ArrayList<Course>();
	}

	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public int getTotalUnits() {
		int numbOfUnits = 0;
		for (Course course : courses) {
			numbOfUnits += course.getUnits();
		}
		return numbOfUnits;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
//	public void showStudentsByFaculty() {
//		System.out.println("Students list for the course teach by "+this.getName());
//		for (Course course : courses) {
//			for (Student s : course.getStudents()) {
//				System.out.println(s.toString());
//			}
//		}
//	}
	
	public String toString() 
	{
		return super.toString() + " Salary: "+this.salary;
	}

}
