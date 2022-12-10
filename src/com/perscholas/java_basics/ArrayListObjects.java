package com.perscholas.java_basics;

import java.util.ArrayList;

class Employee2 {

	String firstName, lastName, department;

	public Employee2(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}

}

public class ArrayListObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		String[] lastName = { "Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr" };

		String[] department = { "production", "r&d", "sales", "marketing", "human resources", "accounting", "sales",
				"r&d" };

		ArrayList<Employee2> e = new ArrayList<Employee2>(addEmployees(firstName, lastName, department));

		System.out.println(e);

	}

	public static ArrayList<Employee2> addEmployees(String[] first, String[] last, String[] department) {
		ArrayList<Employee2> employees = new ArrayList<>();

		for (int i = 0; i < department.length; i++) {
			employees.add(new Employee2(first[i], last[i], department[i]));
		}
		return employees;
	}

}
