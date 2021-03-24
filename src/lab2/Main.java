package lab2;

public class Main {
	public static void main(String[] args)
	{
		Department d =  new Department("Computer Science");
		Person f1 = new Faculty("Frank Moore", "472-5921", 43, 10000);
		Person f2 = new Faculty("Sam Howard", "472-7222", 55, 9500);
		Person f3 = new Faculty("John Doodle", "472-6190", 39, 8600);
		
		Person s1 = new Student("John Doe", "472-1121", 22, 4.0);
		Person s2 = new Student("Mary Jones", "472-7322", 32, 3.80);
		Person s3 = new Student("Lee Johnson", "472-6009", 19, 3.65);
		
		Person staff1 = new Staff("Frank Gore", "472-3321", 33, 4050);
		Person staff2 = new Staff("Adam Davis", "472-7552", 50, 5500);
		Person staff3 = new Staff("David heck", "472-8890", 29, 3600);
		
		Course course1 = new Course("CS201", "Programming 1", 4, (Faculty) f3);
		Course course2 = new Course("CS360", "Databases", 3, (Faculty) f2);
		Course course3 = new Course("CS404", "Compilers", 4, (Faculty) f3);
		Course course4 = new Course("CS240", "Data structures", 2, (Faculty) f3);
		Course course5 = new Course("CS301", "Software Engineering", 3, (Faculty) f2);
		Course course6 = new Course("CS450", "Advanced Architecture", 5, (Faculty) f1);
		
		((Student) s1).addCourse(course1);
		((Student) s1).addCourse(course2);
		((Student) s1).addCourse(course3);
		((Student) s1).addCourse(course5);
		

		((Student) s2).addCourse(course1);
		((Student) s2).addCourse(course3);
		((Student) s2).addCourse(course6);
		

		((Student) s3).addCourse(course1);
		((Student) s3).addCourse(course2);
		((Student) s3).addCourse(course4);
		((Student) s1).addCourse(course6);
		
		
		
	}

}
