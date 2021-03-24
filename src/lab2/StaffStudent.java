package lab2;

import java.time.LocalDate;
import java.util.ArrayList;

public class StaffStudent extends Staff {
	private LocalDate dateStart;
	private ArrayList<Course> courses;
	private Student student;

	public StaffStudent(String name, String phone, int age, double salary, LocalDate date) {
		super(name, phone, age, salary);
		this.dateStart = date;
		this.courses = new ArrayList<Course>();
	}

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public void addCourse(Course c) {
		courses.add(c);
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

}
