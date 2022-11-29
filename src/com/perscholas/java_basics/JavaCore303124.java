package com.perscholas.java_basics;

public class JavaCore303124 {

	public static void main(String[] args) {
		/*
		 * Write a program that declares 2 integer variables,
		 * assigns an integer to each, and divides the larger number by the smaller number.
		 * Assign the result to a variable. Print out the result.
		 * Now change the larger number to a decimal. What happens? What corrections are needed?
		 */
		int intSmall = 2;
		double doubleBig = 6.1;
		double resultDiv = intSmall/doubleBig;
		System.out.println(resultDiv);
		//The result variable needed to be changed to a Double to handle the different data type.
		System.out.println("======");
	}

}
