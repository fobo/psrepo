package com.perscholas.java_basics;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class MyException extends Exception {

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class TypingPractice {

	TypingPractice() {
	};

	void typeABC() throws MyException {
		// allow the user to type a string
		// if string doesnt match "abc" throw an exception

		Scanner scan = new Scanner(System.in);
		String input = "";
		
			System.out.println("Input abc");
			System.out.println(input);
			input = scan.nextLine();
			if (!input.equals("abc")) {
				
				
				throw new MyException("incorrect input");
			} else {
				System.out.println("You typed it right!");
				
			}

		

		scan.close();
	}

}

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// divide();

		TypingPractice obj = new TypingPractice();

		boolean notABC = true;
		while (notABC) {
			try {
				obj.typeABC();
				notABC = false;
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println("try again");
			} 
		}
		
		divide();

	}

	static void divide() {
		Scanner scan = new Scanner(System.in);
		double result;
		int int1 = 0;
		int int2 = 0;

		// input two integers
		// print value of dividing them
		// use a try catch to catch math exception
		boolean exceptionTrue = true;

		while (exceptionTrue) {

			try {
				System.out.print("Input whole integer: ");
				int1 = scan.nextInt();
				System.out.println("\n");
				System.out.println("Input another whole integer: ");
				int2 = scan.nextInt();
				result = int1 / int2;

				System.out.println(result);
				exceptionTrue = false;
			} catch (InputMismatchException | ArithmeticException e) {
				if (e instanceof InputMismatchException) {
					// input mismatch
					System.out.println("Please only use integers");
					scan.nextLine();
				} else {
					System.out.println("Please do not use zero");
				}
			}

		}

		scan.close();

	}

}
