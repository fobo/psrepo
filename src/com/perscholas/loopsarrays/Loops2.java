package com.perscholas.loopsarrays;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
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

}
