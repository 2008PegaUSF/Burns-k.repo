package Assignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import ForSortEmployee.AgeSort;
import ForSortEmployee.DepartSort;
import ForSortEmployee.NameSort;


public class SortEmployee extends Driver implements Comparable<SortEmployee> {
	//instance variables
	public String name;
	public String department;
	public int age;
	//constructor
	public SortEmployee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}

	//getters and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//use so it won't print out the memory location
	public String toString() {
		return "Employee: " + name +" Department: "+department+ " Age: "+age+"\n";
	}
	public void Collect() {
		
		//setting up the array list and adding people
		List<SortEmployee> employee = new ArrayList<SortEmployee>();
		employee.add(new SortEmployee("Luke Waller","Human Resources",55));
		employee.add(new SortEmployee("Sally McBeth","Accounting",36));
		
		//finally sorting them
		//calling the array and the other classes
		Collections.sort(employee, new NameSort());
		System.out.println("Sorting by First Name: " +"\n"+employee);
		
		Collections.sort(employee, new DepartSort());
		System.out.println("Sorting by Department: " +"\n"+employee);
		
		Collections.sort(employee, new AgeSort());
		System.out.println("Sorting by Age: " +"\n" +employee);
	}

	//this was added so mt code could run. not sure what it does
	public int compareTo(SortEmployee o) {
		
		return 0;
	}
}
