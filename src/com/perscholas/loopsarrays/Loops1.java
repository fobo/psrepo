package com.perscholas.loopsarrays;

public class Loops1 {

	public static void main(String[] args) {
		// User nesteds loops to create a multiplication tabale (12x12)
		
		for(int i = 1 ; i < 13 ; i++) {
			//row
			//Do not need to print anything here
			System.out.println("\n");
			for(int j = 1 ; j < 13 ; j++) {
				//column
				System.out.print(i*j + "  ");
			}
		}

	}

}
