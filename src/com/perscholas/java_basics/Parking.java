package com.perscholas.java_basics;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  
	Example: Price for mall parking is $xx.xx
      Price for hospital  parking is $xx.xx
 */
		MallParking park1 = new MallParking(6);
		System.out.println("Price for mall parking is $" + park1.processTicket());
		 //mall parking process ticket method
		MallParking park2 = new MallParking(19);
		System.out.println("Price for mall parking is $" + park2.processTicket());
		
		HospitalParking park3 = new HospitalParking(12);
		System.out.println("Price for Hospital parking is $" + park3.processTicket());
		
	}

	@Override
	public String toString() {
		return "Parking []";
	}

}

interface ParkingSystem {
	public static final double NIGHTLY = 30;
	public static final double MORNING = 20;
	public static final double TWENTY_FOUR = 45;

	double processTicket();

}

class MallParking implements ParkingSystem {
//Example: If the ticket is from mall parking and the time is between 5am - 5pm. The price would 10% * 20 + 20 = $22.00
	int time;
	double surcharge = 1.1;

	public MallParking(int time) {
		this.time = time;

	}

	
	@Override
	public String toString() {
		return "MallParking [time=" + time + ", surcharge=" + surcharge + "]";
		
	}


	@Override
	public double processTicket() {
		if (5 <= this.time && this.time <= 17) { // morning rate
			return MORNING * surcharge;
		} else if (17 <= this.time && this.time <= 24) {
			return NIGHTLY * surcharge;
		} else {
			return TWENTY_FOUR * surcharge;
		}

	}

}

class HospitalParking implements ParkingSystem {
	int time;
	double surcharge = 1.2;

	public HospitalParking(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "HospitalParking [time=" + time + ", surcharge=" + surcharge + "]";
	}

	@Override
	public double processTicket() {
		if (5 <= this.time && this.time <= 17) { // morning rate
			return MORNING * surcharge;
		} else if (17 <= this.time && this.time <= 24) {
			return NIGHTLY * surcharge;
		} else {
			return TWENTY_FOUR * surcharge;
		}

	}

}