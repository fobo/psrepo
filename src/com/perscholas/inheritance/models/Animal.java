package com.perscholas.inheritance.models;

public class Animal {
	//Fields
	int Limbs; //arms, legs, fins
	String Name;
	String Diet; //Herbivore, Carnivore, Omnivore;
	//Constructors
	
	public Animal() {
	}
	
	public Animal(int limbs, String name, String diet) {
		this.Limbs = limbs;
		this.Name = name;
		this.Diet = diet;
	}
	
	//Methods
	public void makeNoise() {
		//Default
		System.out.println("No noise is heard.");
	}

	public int getLimbs() {
		return Limbs;
	}

	public void setLimbs(int limbs) {
		Limbs = limbs;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDiet() {
		return Diet;
	}

	public void setDiet(String diet) {
		Diet = diet;
	}
	
}
