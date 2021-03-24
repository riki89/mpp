package lab2;

import java.util.ArrayList;

public class Student extends Person {
	private double GPA;
	private ArrayList<Course> courses;

	public Student(String name, String phone, int age, double GPA) {
		super(name, phone, age);
		this.GPA = GPA;
		this.courses = new ArrayList<Course>();
	}

	public String toString() {
		return super.toString() + " GPA: "+this.GPA;
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

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
