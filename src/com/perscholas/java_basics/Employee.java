package com.perscholas.java_basics;

public class Employee {
	// field
	private int id;
	String name;
	short yearJoined;
	// constructors
		public Employee() {
			
		}
		
		public Employee(String someEmpName) {
			name = someEmpName;
		}
		
		public Employee(int someEmpId, String someEmpName,short someEmpYearJoined){
			this(someEmpName);
			id = someEmpId;
			// name = someEmpName;
			yearJoined = someEmpYearJoined;
		}
		
		// methods
	@Override
	public String toString() {
		return String.format("My name is %s and my ID is: %d, been with the company since %d", name, id, yearJoined);
		
	}
	
	public String myName(){
		
		if(this.yearJoined<=2020) {
			return "My name is " + this.name;
		}else {
			return "Hello " + this.name;
		}
		
	}
	
	public String myName(String name, String anotherName){
			return "My name is " + name;
	}
	
	// before or equals 2020 > thank you for your service
	// after 2020 > keep it up ...
	public void yearOfJoin() {
		if(this.yearJoined <= 2020) {
			System.out.println(this.name +" thank you for your service");
		} else {
			System.out.println("keep it up ...");
		}
	}
	
	// getters and setters
	
	
	public int getId() {
		this.yearOfJoin();
		return this.id;
	}
	
	
	
	
	
}
