package com.perscholas.java_basics;

public class Contstructors {

	public static void main(String[] args) {
		
		Employee empOne = new Employee(10, "jafer", (short)2020);
		System.out.println(empOne.toString());
		//empOne.yearOfJoin();
		System.out.println(empOne.getId());
		System.out.println(empOne.getId());
		String x = empOne.myName();
		System.out.println(x);
		
		
		Employee empTwo = new Employee();
		//empTwo.id = 20;
		empTwo.name = "Li";
		empTwo.yearJoined = 2022;
		//System.out.println(empTwo.toString());
		//empTwo.yearOfJoin();
		
		String xx = empTwo.myName();
		System.out.println(xx);
		
		
		
		Employee empThree = new Employee("kevin");
		//System.out.println(empThree.toString());
		
	}

}
