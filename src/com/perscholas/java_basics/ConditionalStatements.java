package com.perscholas.java_basics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
		question7();

	}

	public static void question1() {
		System.out.println("Question 1");
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
		 * Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 */
		int x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		}
		System.out.println("==============");
	}

	public static void question2() {
		System.out.println("Question 2");
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
		 * Write an if-else statement that prints out “Less than 10” if x is less than
		 * 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice
		 * the result.
		 */
		int x = 15;
		if (x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		System.out.println("==============");
	}

	public static void question3() {
		System.out.println("Question 3");
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */
		int x = 50;
		if (x < 10) {
			System.out.println("Less than 10");
		} else if(10 < x && x < 20){ //Exclusive AND
			System.out.println("Between 10 and 20");
		} else { // This condition will only run on 20 or higher (Inclusive)
			System.out.println("Greater than or equal to 20");
		}
		
		System.out.println("==============");
	}

	public static void question4() {
		System.out.println("Question 4");
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */
		int x = 5;
		if (10 > x || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In Range"); // Don't need any comparison for in range, all other options are covered by previous statement
		}
		System.out.println("==============");
	}

	public static void question5() {
		System.out.println("Question 5");
		/*
		 * Write a program that uses if-else-if statements to print out grades A, B, C,
		 * D, F according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 * 
		 */
		//gather input
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		if(0 > x || x > 100) {
			System.out.println("Out of range");
		}else if(90 <= x && x <= 100) {
			System.out.println("Grade: A");
		}else if(80 <= x && x <= 89) {
			System.out.println("Grade: B");
		}else if(70 <= x && x <= 79) {
			System.out.println("Grade: C");
		}else if(60 <= x && x <= 69) {
			System.out.println("Grade: D");
		}else if(60 > x) {
			System.out.println("Grade: F");
		}
		scan.close();
		System.out.println("==============");
	}

	public static void question6() {
		System.out.println("Question 6");
		/*
		 * Write a program that accepts an integer between 1 and 7 from the user. Use a
		 * switch statement to print out the corresponding weekday. Print “Out of range”
		 * if the number is less than 1 or greater than 7. Do not forget to include
		 * “break” statements in each of your cases.
		 */
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch (x) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			//less than 1 or greater than 7 (or any other input)
			System.out.println("Out of range");
			break;
		}
		scan.close(); //close scanner
		System.out.println("==============");
	}

	public static void question7() {
		System.out.println("Question 7");
		/*
		 * Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Input status: \nSingle - 1\nMarried Filing Jointly - 2\nMarried Filing Separately - 3\nHead of Household - 4");
		int status = scan.nextInt();
		float taxRate;
		System.out.println("Input income: ");
		float income = scan.nextFloat();
		switch (status) {
		case 1://Single
			if(0 < income && income < 8350) {
				//Tax rate = 10%
				taxRate = .10f;
				System.out.println("Tax Rate: 10%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(8351 < income && income < 33950) {
				//Tax rate = 15%
				taxRate = .15f;
				System.out.println("Tax Rate: 15%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(33951 < income && income < 82250) {
				//Tax rate = 25%
				taxRate = .25f;
				System.out.println("Tax Rate: 25%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(82251 < income && income < 171550) {
				//Tax rate = 28%
				taxRate = .28f;
				System.out.println("Tax Rate: 28%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(171551 < income && income < 372950) {
				//Tax rate = 33%
				taxRate = .33f;
				System.out.println("Tax Rate: 33%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(372951 < income){
				//Tax rate = 35%
				taxRate = .35f;
				System.out.println("Tax Rate: 35%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}
			break;
		case 2://Married Filing Jointly
			if(0 < income && income < 16700) {
				//Tax rate = 10%
				taxRate = .10f;
				System.out.println("Tax Rate: 10%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(16701 < income && income < 67900) {
				//Tax rate = 15%
				taxRate = .15f;
				System.out.println("Tax Rate: 15%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(67901 < income && income < 137050) {
				//Tax rate = 25%
				taxRate = .25f;
				System.out.println("Tax Rate: 25%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(137051 < income && income < 208850) {
				//Tax rate = 28%
				taxRate = .28f;
				System.out.println("Tax Rate: 28%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(1 < income && income < 372950) {
				//Tax rate = 33%
				taxRate = .33f;
				System.out.println("Tax Rate: 33%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(372951 < income){
				//Tax rate = 35%
				taxRate = .35f;
				System.out.println("Tax Rate: 35%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}
			break;
		case 3://Married Filing Separately
			if(0 < income && income < 8350) {
				//Tax rate = 10%
				taxRate = .10f;
				System.out.println("Tax Rate: 10%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(8351 < income && income < 33950) {
				//Tax rate = 15%
				taxRate = .15f;
				System.out.println("Tax Rate: 15%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(33951 < income && income < 68525) {
				//Tax rate = 25%
				taxRate = .25f;
				System.out.println("Tax Rate: 25%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(68526 < income && income < 104425) {
				//Tax rate = 28%
				taxRate = .28f;
				System.out.println("Tax Rate: 28%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(104426 < income && income < 186475) {
				//Tax rate = 33%
				taxRate = .33f;
				System.out.println("Tax Rate: 33%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(186476 < income){
				//Tax rate = 35%
				taxRate = .35f;
				System.out.println("Tax Rate: 35%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}
			break;
		case 4://Head of Household
			if(0 < income && income < 11950) {
				//Tax rate = 10%
				taxRate = .10f;
				System.out.println("Tax Rate: 10%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(11951 < income && income < 45500) {
				//Tax rate = 15%
				taxRate = .15f;
				System.out.println("Tax Rate: 15%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(45501 < income && income < 117450) {
				//Tax rate = 25%
				taxRate = .25f;
				System.out.println("Tax Rate: 25%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(117451 < income && income < 190200) {
				//Tax rate = 28%
				taxRate = .28f;
				System.out.println("Tax Rate: 28%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(190201 < income && income < 372950) {
				//Tax rate = 33%
				taxRate = .33f;
				System.out.println("Tax Rate: 33%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}else if(372951 < income){
				//Tax rate = 35%
				taxRate = .35f;
				System.out.println("Tax Rate: 35%");
				System.out.printf("Total Due: %.2f", (income * taxRate));
			}
			break;

		default:
			break;
		}
		scan.close();
		System.out.println("\n==============");
	}

}
