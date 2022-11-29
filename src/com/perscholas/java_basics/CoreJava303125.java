package com.perscholas.java_basics;

public class CoreJava303125 {

	public static void main(String[] args) {
		/*
		 * Write a program that declares 2 double variables, assigns a number to each, 
		 * and divides the larger by the smaller. Assign the result to a variable. 
		 * Print out the result. Now, cast the result to an integer. Print out the result again.
		 */
		double dFiveSmall = 2.4, dFiveBig = 4.9;
		double dFiveResult = dFiveSmall/dFiveBig;
		System.out.println(dFiveResult);
		int intFiveCast = (int)dFiveResult;
		System.out.println(intFiveCast);
		System.out.println("======");
	}

}
