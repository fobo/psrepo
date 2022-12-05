package com.perscholas.loopsarrays;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		
		
		question1();
		question2();
		question3();


	}



	private static void question1() {
		// Use nested loops to create a multiplication table (12x12)
		System.out.println("Question 1");
		for(int i = 1 ; i < 13 ; i++) {
			//row
			//Do not need to print anything here
			System.out.println("\n");
			for(int j = 1 ; j < 13 ; j++) {
				//column
				System.out.print(i*j + "  ");
			}
		}
		System.out.println("==============");
	}

	private static void question2() {
		/*Write a program that finds the greatest common divisor between two positive integers
		 * This program must prompt the user for these two integers
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a WHOLE POSITIVE INTEGER. (n1)");
		int n1 = input.nextInt();
		System.out.println("Please input anoter WHOLE POSITIVE INTEGER. (n1)");
		int n2 = input.nextInt(); // Gather number inputs from user
		
		int gcd = 1; //This is the bare minimum it can be
		
		for (int i = 1; i <= n1 && i <= n2 ; i++) {
			if (n1 % i == 0 && n2 % i == 0 && i != 1) { //if number modulus iterator equals zero for both then...
				gcd = i; //iterator must be GCD
				break; //escape from loop
			}
		}
		System.out.println(gcd);
		input.close();
	}

	private static void question3() {
		/*Suppose the tuition for a university is 10000 for the current year
		 * and increases by 7% every year
		 * in how many years will the tuition be doubled?
		 * 
		 * Find with tuition >= 20000
		 */

		float tuition = 10000;
		int year = 1; //This is a basic iterator
		final float YOY_INCREASE_PERCENTAGE = 1.07f;
		while(tuition < 20000) {
			tuition = tuition * (YOY_INCREASE_PERCENTAGE);
			System.out.printf("Tuition: $%.2f", tuition);
			System.out.println("\nYear: " + ++year);
		}
	}
}
