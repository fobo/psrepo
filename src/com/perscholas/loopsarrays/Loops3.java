package com.perscholas.loopsarrays;

public class Loops3 {

	public static void main(String[] args) {
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
