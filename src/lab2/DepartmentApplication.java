package lab2;

import java.io.*;                 // for I/O
import java.lang.Integer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class DepartmentApplication
   {
   public static void main(String[] args) throws IOException
      {
      Department dept = new Department("ComputerScience");
      
      //  The following commented out code will help you 
      //  create the objects that you need.


      //  CHANGE the code below so that instead of addFaculty, 
      //  addStudent, and  addStaff, we have ONLY ONE method, 
      //  addPerson (this replaces the other three methods).

      
      /*******************************************************/
      
		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
		Person samHoward = new Faculty("Sam Howard","472-7222",55,9500);
		Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600);

		dept.addPerson(frankMoore);
		dept.addPerson(samHoward );
		dept.addPerson(johnDoodle);


		// Create student objects
		Person johnDoe = new Student("John Doe",       "472-1121", 22,4.0);
		Person maryJones = new Student("Mary Jones",   "472-7322", 32,3.80);
		Person leeJohnson = new Student("Lee Johnson", "472-6009", 19,3.65);

		dept.addPerson (johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		

		// Create staff objects
		Person frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Person adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Person davidHeck = new Staff("David Heck","472-8890",29,3600);
		dept.addPerson (frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);
		// Create course objects

/* The below is giving a faculty reference as the last argument.  This is a Mistake since it is one directional.  The  ‘1’  next to the Faculty class in the class diagram is Not implemented in the Course class.  It is there only to show us that a course is taught by only one faculty.
However, this mistake below does show us How we could implement the code IF it was two-directional!  */
	
		/*
		Course cs201 = new Course("cs201","programming",4, (Faculty) johnDoodle);
		Course cs360 = new Course("cs360","database",3, (Faculty) samHoward);
		Course cs404 = new Course("cs404","compiler",4, (Faculty) johnDoodle);
		Course cs240 = new Course("cs240","datastructure",2, (Faculty) johnDoodle);
		Course cs301 = new Course("cs301","Software engg",3, (Faculty) samHoward);
		Course cs450 = new Course("cs450","Advanced architecture",5,(Faculty) frankMoore);
		*/
		Course cs201 = new Course("cs201","programming",4);
		Course cs360 = new Course("cs360","database",3);
		Course cs404 = new Course("cs404","compiler",4);
		Course cs240 = new Course("cs240","datastructure",2);
		Course cs301 = new Course("cs301","Software engg",3);
		Course cs450 = new Course("cs450","Advanced architecture",5);
		
		/*
		 * The above course objects will go inside either
		 * a faculty object, or a student object.  Not all of the course
		 *  objects go into the same object.
		 * 
		 *  You would have code that looks something like :
		 *  frankMoore.addCourse(cs450);
		 * 
		 *  The addCourse method would have to be written in
		 *  the faculty class.  Something similar would be done 
		 *  for students.
		 */
		((Faculty) johnDoodle).addCourse(cs201);
		((Faculty) johnDoodle).addCourse(cs404);
		((Faculty) johnDoodle).addCourse(cs240);

		((Faculty) samHoward).addCourse(cs360);
		((Faculty) samHoward).addCourse(cs301);
		((Faculty) frankMoore).addCourse(cs450);
      
      /********************************************************/
		//**********LEVEL 2***********
		//53250.0 - 41250.0 = 12000.0
		//create staffStudents
		Person ammanuelTaf = new StaffStudent("Ammanuel Taf","472-3323",33,4000, LocalDate.of(2021, 03, 01));
		Person ahmedEmad = new StaffStudent("Ahmed Emad","472-7553",50,5000, LocalDate.of(2021, 03, 01));
		Person ismaelBen = new StaffStudent("Ismael Bennacer","472-8893",29,3000, LocalDate.of(2021, 03, 01));
		dept.addPerson (ammanuelTaf);
		dept.addPerson(ahmedEmad);
		dept.addPerson(ismaelBen);
		
		//add staff students
		Student ammanTaf = new Student("Ammanuel Taf","472-3323",33,3.90);
		Student ahmEmad = new Student("Ahmed Emad", "472-7553", 50, 3.70);
		Student ismaBen = new Student("Ismael Bennacer", "472-8893", 29, 3.65);
		
		((StaffStudent) ammanuelTaf).setStudent(ammanTaf);
		((StaffStudent) ahmedEmad).setStudent(ahmEmad);
		((StaffStudent) ismaelBen).setStudent(ismaBen);
		
		//********LEVEL 3***************
		List<Course> courses = List.of(cs201, cs360, cs404, cs240, cs301, cs450);
		//add students to courses
		cs201.addStudent(ammanTaf);
		cs201.addStudent((Student) johnDoe);
		cs201.addStudent(ismaBen);
		

		cs360.addStudent(ahmEmad);
		cs360.addStudent((Student) leeJohnson);
		

		cs404.addStudent(ismaBen);
		cs404.addStudent((Student) maryJones);
		cs404.addStudent((Student) leeJohnson);
		

		cs240.addStudent((Student) johnDoe);
		cs240.addStudent(ammanTaf);
		cs240.addStudent((Student) maryJones);
		

		cs301.addStudent(ammanTaf);
		cs301.addStudent((Student) leeJohnson);
		cs301.addStudent((Student) johnDoe);
		

		cs450.addStudent((Student) leeJohnson);
		cs450.addStudent(ismaBen);
		cs450.addStudent(ammanTaf);
		
		//add faculty ref to courses
		cs201.setFaculty((Faculty) johnDoodle);
		cs404.setFaculty((Faculty) johnDoodle);
		cs240.setFaculty((Faculty) johnDoodle);

		cs360.setFaculty((Faculty) samHoward);
		cs301.setFaculty((Faculty) samHoward);
		cs450.setFaculty((Faculty) frankMoore);
      
      
      double totsalary = 0;

      while(true)
         {
         putText("Enter first letter of ");
         putText("getTotalSalary, showAllMembers, unitsPerFaculty, faculty students or quit : ");
         int choice = getChar();
         switch(choice)
            {
            case 'g':
               totsalary=dept.getTotalSalary();
               putText("Total sum of all salaries is:");
               putText(String.valueOf(totsalary)+"\n");              
               break;
            case 's':
               dept.showAllMembers();
               break;
            case 'u':
               dept.unitsPerFaculty();
               break;
               
            case 'f':
            	showStudents(courses, "Frank Moore");
                break;
            case 'q': return;
            default:
               putText("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
// -------------------------------------------------------------
   public static void putText(String s) //writes string s to the screen
      {
      System.out.println(s);
      }
// -------------------------------------------------------------
   public static String getString() throws IOException  //reads a string from the keyboard input
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
   public static char getChar() throws IOException //reads a character from the keyboard input
      {
      String s = getString();
      return s.charAt(0);
      }

//-------------------------------------------------------------
   public static int getInt() throws IOException // reads an integers from the keyboard input
      {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
   //-----------------
   public static void showStudents(List<Course> list, String faculty)
   {
	   boolean listVoid = true;
	   for (Course course : list) {
		   if (course.getFaculty().getName().equalsIgnoreCase(faculty))
			{
				listVoid = false;
				course.showStudentsByFaculty();
			}
	   }
	   
	   //stream version
	   list.stream().filter(c -> 
	   	{
	   		Boolean a = c.getFaculty().getName().equalsIgnoreCase(faculty);
			
				c.showStudentsByFaculty();
			
			return a;
	   	});
	   			
	   //list.stream().filter(n -> n.getFaculty().getName().equalsIgnoreCase(faculty)).map(n -> {n.showStudentsByFaculty(); return n;});
	   
	   if (listVoid) {System.out.println("No Student found for this faculty");}
   }
   //-----------------
   }  // end class 
