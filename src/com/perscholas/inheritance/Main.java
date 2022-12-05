package com.perscholas.inheritance;

import com.perscholas.inheritance.models.Animal;
import com.perscholas.inheritance.models.Cat;
import com.perscholas.inheritance.models.Human;
import com.perscholas.inheritance.models.Octopus;

public class Main {

	public static void main(String[] args) {
		//Human(int limbs, String name, String diet, int Friends, String Job, int Siblings) 
		Human human = new Human(4, "Kevin", "Omnivore", 17, "School", 5);
		human.makeNoise();
		
		//Octopus(int limbs, String name, String diet, String Color, int favoriteNumber, String favoriteSong)
		Octopus octo = new Octopus(8, "Octavius", "Omnivore", "Blue and Yellow", 8, "Yellow Submarine");
		octo.makeNoise();
		octo.swim();
		
		//Cat(int limbs, String name, String diet, String breed, boolean fluffyTail, String eyeColor)
		Cat cat = new Cat(4, "Kitty", "Omnivore", "Calico", true, "Green");
		cat.makeNoise();
		cat.causeMayhem();
		
		
	}

}
