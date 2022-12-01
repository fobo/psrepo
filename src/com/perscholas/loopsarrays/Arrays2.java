package com.perscholas.loopsarrays;

public class Arrays2 {

	public static void main(String[] args) {
		/* Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} 
		 * and produce the following output: 7
		 * 
		 */
		int[] intArray = new int[] {13,5,7,68,2};
		//find index of final array member, divide by 2, that should be the index of the middle
		
		System.out.println(intArray[intArray.length/2]);

	}

}
