package lab2;

import java.util.ArrayList;

public class Course {
	private String number;
	private String title;
	private int units;
	private Faculty faculty;
	private ArrayList<Student> students;
	
	public Course(String number, String title, int units, Faculty faculty) {
		super();
		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = faculty;
		this.students = new ArrayList<Student>();
	}
	
	public Course(String number, String title, int units) {
		super();
		this.number = number;
		this.title = title;
		this.units = units;
		this.students = new ArrayList<Student>();
	}
	
	void addStudent(Student s) {
		students.add(s);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void showStudentsByFaculty() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
