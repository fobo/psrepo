package com.perscholas.inheritance.models;

public class Octopus extends Animal{
	String Color;
	int favoriteNumber;
	String favoriteSong;

	
	public Octopus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Octopus(int limbs, String name, String diet, String Color, int favoriteNumber, String favoriteSong) {
		super(limbs, name, diet);
		this.Color = Color;
		this.favoriteNumber = favoriteNumber;
		this.favoriteSong = favoriteSong;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeNoise() {
		System.out.println("Glub glub");
	}
	public void swim() {
		System.out.println("Swish");
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getFavoriteNumber() {
		return favoriteNumber;
	}
	public void setFavoriteNumber(int favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	public String getFavoriteSong() {
		return favoriteSong;
	}
	public void setFavoriteSong(String favoriteSong) {
		this.favoriteSong = favoriteSong;
	}
	
}
