package com.perscholas.inheritance.models;

public class Cat extends Animal{
	String Breed;
	boolean fluffyTail;
	String eyeColor;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(int limbs, String name, String diet, String breed, boolean fluffyTail, String eyeColor) {
		super(limbs, name, diet);
		Breed = breed;
		this.fluffyTail = fluffyTail;
		this.eyeColor = eyeColor;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	public void causeMayhem() {
		System.out.println("Destroys a plate by knocking it off a table");
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public boolean isFluffyTail() {
		return fluffyTail;
	}
	public void setFluffyTail(boolean fluffyTail) {
		this.fluffyTail = fluffyTail;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	


}
