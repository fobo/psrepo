package com.perscholas.inheritance.models;

public class Human extends Animal{

	int Friends;
	String Job;
	int Siblings;
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Human(int limbs, String name, String diet, int Friends, String Job, int Siblings) {
		super(limbs, name, diet);
		// TODO Auto-generated constructor stub
		this.Friends = Friends;
		this.Job = Job;
		this.Siblings = Siblings;
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("I need to go to work today.");
	}
	public int getFriends() {
		return Friends;
	}
	public void setFriends(int friends) {
		Friends = friends;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public int getSiblings() {
		return Siblings;
	}
	public void setSiblings(int siblings) {
		Siblings = siblings;
	}

	
	


	
}
