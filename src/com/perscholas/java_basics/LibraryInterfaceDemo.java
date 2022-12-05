package com.perscholas.java_basics;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kid1 = new KidUsers(10,"Kids");
		KidUsers kid2 = new KidUsers(18,"Fiction");
		AdultUser adult1 = new AdultUser(5,"Kids");
		AdultUser adult2 = new AdultUser(23,"Fiction");
		System.out.println("Kids ============");
		kid1.registerAccount();
		kid2.registerAccount();
		kid1.requestBook();
		kid2.requestBook();
		
		System.out.println("Adults ============");
		adult1.registerAccount();
		adult2.registerAccount();
		adult1.requestBook();
		adult2.requestBook();
	}

}

interface LibraryUser {

	public void registerAccount();

	public void requestBook();
}

class KidUsers implements LibraryUser {

	int age;
	String bookType;

	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(this.age <= 11) {
			System.out.println("You have successfully registered under a Kids Account");
		}else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		
		if(this.bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books");
		}

	}

}

class AdultUser implements LibraryUser {

	int age;
	String bookType;

	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(this.age>=12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}

	}

	@Override
	public void requestBook() {
		if(this.bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

	}

}
