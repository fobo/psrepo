package com.perscholas.java_basics;

public class CoreJava303126 {

	public static void main(String[] args) {
		/*
		 * Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. 
		 * Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
		 * 
		 */
		
		int x, y;
		x = 5;
		y = 6;
		double q = y/x;
		System.out.println(q);
		q = (double)y;
		System.out.println(q);
	}

}
