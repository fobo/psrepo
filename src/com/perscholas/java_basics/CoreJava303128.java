package com.perscholas.java_basics;

public class CoreJava303128 {

	public static void main(String[] args) {
		/*
		 * Write a program where you create 3 variables that represent products at a cafe. 
		 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
		 * Assign prices to each product. Create 2 more variables called subtotal and totalSale 
		 * and complete an “order” for 3 items of the first product, 4 items of the second product, 
		 * and 2 items of the third product. Add them all together to calculate the subtotal. 
		 */
		float cappuccino = 5.16f;
		float coffee = 3.17f;
		float espresso = 4.18f;
		float subtotal;
		float totalSale;
		final float SALES_TAX = 1.06f;
		//adding up items
		subtotal = 3 * cappuccino;
		subtotal += 4 * coffee;
		subtotal += 2 * espresso;
		subtotal = subtotal * SALES_TAX;
		totalSale = subtotal;
		System.out.println(totalSale);
		
	}

}
