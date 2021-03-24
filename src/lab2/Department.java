package lab2;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private ArrayList<Person> persons;

	public Department(String name) {
		super();
		this.name = name;
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public List<Person> getPersons() {
		return persons;
	}
	
	public double getTotalSalaryIO() {
		double sum = 0;
		for (Person person : persons) {
			if (person instanceof Student)
				sum += ((Student) person).getGPA();
			else if (person instanceof Staff) 
				sum += ((Staff) person).getSalary();
			else if (person instanceof Faculty)
				sum += ((Faculty) person).getSalary();
		}
		return sum;
	}
	
	public double getTotalSalary() {
		double sum = 0;
		for (Person person : persons) {
			sum += person.getSalary();
		}
		return sum;
	}
	
	public void showAllMembers() {
		String type = " ";
		for (Person person : persons) {
			
			if (person instanceof Staff) type = "staff";
			if (person instanceof Student) type = "student";
			if (person instanceof Faculty) type = "faculty";
			
			System.out.println("name: "+person.getName()+" pohne number: "+person.getPhone()+
					" age: "+person.getAge()+" type: "+type);
		}
	}
	
	public void unitsPerFaculty() {
		for (Person person : persons) {
			if (person instanceof Faculty) {
				System.out.println("name: "+person.getName()+
						" number of unity: "+((Faculty) person).getTotalUnits());
			}
		}
	}
	
	public void unitsPerFaculty2() {
		for (Person person : persons) {
			if (person.getClass().getSimpleName().equalsIgnoreCase("Faculty") ) {
				System.out.println("name: "+person.getName()+
						" number of unity: "+((Faculty) person).getTotalUnits());
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
