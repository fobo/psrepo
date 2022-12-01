package com.perscholas.java_basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Core Java - Variables 303.1.2 - Practice Assignment
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */

		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();

	}

	public static void q1() {
		System.out.println("Question 1");
		int integerOne = 15;
		int integerTwo = 17;
		int sumOfValues = integerOne + integerTwo;
		System.out.println(sumOfValues);
		System.out.println("======");
	}

	public static void q2() {
		System.out.println("Question 2");
		/*
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */
		double dOne = 5.6, dTwo = 7.8, dSum = dOne + dTwo;
		System.out.println(dSum);
		System.out.println("======");
	}

	public static void q3() {
		System.out.println("Question 3");
		/*
		 * Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be?
		 */
		int intThree = 9;
		double dThree = 6.1;
		double threeSum = intThree + dThree;
		System.out.println(threeSum);
		// Variable type must be a double
		System.out.println("======");
	}

	public static void q4() {
		System.out.println("Question 4");
		/*
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? What corrections are needed?
		 */
		int intSmall = 2;
		double doubleBig = 6.1;
		double resultDiv = intSmall / doubleBig;
		System.out.println(resultDiv);
		// The result variable needed to be changed to a Double to handle the different
		// data type.
		System.out.println("======");
	}

	public static void q5() {
		System.out.println("Question 5");
		/*
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and divides the larger by the smaller. Assign the result to a variable. Print
		 * out the result. Now, cast the result to an integer. Print out the result
		 * again.
		 */
		double dFiveSmall = 2.4, dFiveBig = 4.9;
		double dFiveResult = dFiveSmall / dFiveBig;
		System.out.println(dFiveResult);
		int intFiveCast = (int) dFiveResult;
		System.out.println(intFiveCast);
		System.out.println("======");
	}

	public static void q6() {
		System.out.println("Question 6");
		/*
		 * Write a program that declares two integer variables, x, and y, and assigns 5
		 * to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
		 * cast y to a double and assign it to q. Print q again.
		 * 
		 */

		int x, y;
		x = 5;
		y = 6;
		double q = y / x;
		System.out.println(q);
		q = (double) y;
		System.out.println(q);
		System.out.println("======");
	}

	public static void q7() {
		System.out.println("Question 7");
		/*
		 * Write a program that declares a named constant and uses it in a calculation.
		 * Print the result.
		 */
		final int intConst = 5;
		int sevenInt = 7;
		System.out.println(intConst + sevenInt);
		System.out.println("======");
	}

	public static void q8() {
		System.out.println("Question 8");
		/*
		 * Write a program where you create 3 variables that represent products at a
		 * cafe. The products could be beverages like coffee, cappuccino, espresso,
		 * green tea, etc. Assign prices to each product. Create 2 more variables called
		 * subtotal and totalSale and complete an “order” for 3 items of the first
		 * product, 4 items of the second product, and 2 items of the third product. Add
		 * them all together to calculate the subtotal.
		 */
		float cappuccino = 5.16f;
		float coffee = 3.17f;
		float espresso = 4.18f;
		float subtotal;
		float totalSale;
		final float SALES_TAX = 1.06f;
		// adding up items
		subtotal = 3 * cappuccino;
		subtotal += 4 * coffee;
		subtotal += 2 * espresso;
		subtotal = subtotal * SALES_TAX;
		totalSale = subtotal;
		System.out.printf("%.2f", totalSale);
		System.out.println("\n======");
	}

}
