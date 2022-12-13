package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Collections;

interface StaticMethods {
	static void methodOne() {
		System.out.println("m");
	};

	abstract void methodTwo();
}

interface AddTwoNumbers{
	abstract int add(int i,int j);
}

class TestStaticMethod implements StaticMethods {

	TestStaticMethod() {
	}; // implicit constructor

	@Override
	public void methodTwo() {
		System.out.println("M");

	}

}

public class lambdaexpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
	}

	public static void question1() {

		ArrayList<String> names = new ArrayList<>();
		
		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };
		
		Collections.addAll(names, firstName);
		// Print every item in the list using lambda expressions.
		names.forEach(e -> System.out.println(e));
		names.forEach((e) -> System.out.println(e));
		names.forEach((e) -> {
			System.out.println(e);
		});

	}

	private static void question2() {
		TestStaticMethod obj = new TestStaticMethod();
		// obj.methodOne(); Cannot call this method, you cannot override static methods
		StaticMethods.methodOne();
		obj.methodTwo();

	}

	private static void question3() {
		/*
		 * Using any of the three different forms of a lambda expression list above
		 * print every item in the list with their index. Hint you can use the indexOf()
		 * method from Class ArrayList.
		 */
		ArrayList<String> names = new ArrayList<>();

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };

		Collections.addAll(names, firstName);
		names.forEach((e) -> {
			System.out.print(names.indexOf(e));
			System.out.println(" " + e);
		});
		
	}
	private static void question4() {
		ArrayList<String> names = new ArrayList<>();
		
		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };
		
		Collections.addAll(names, firstName);

		names.forEach((e) -> {
			
			System.out.println(e.toUpperCase());
		});
	}
	private static void question5() {
		AddTwoNumbers numbers = (i, j) -> i + j;
		System.out.println(numbers.add(5,10));
	}
	private static void question6() {
		AddTwoNumbers numbers = (i, j) -> i - j;
		System.out.println(numbers.add(5,10));
	}
	
}
