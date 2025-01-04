package com.InterviewPractice;

interface Bike {
	void speedUp();//abstract method

	default void electricSupport() {//concrete method
		System.out.println("Electric support provided");
	}
}

interface ElectricBike {
	void roboticBike();
}

class Remote implements Bike, ElectricBike {//multiple inheritance
	@Override
	public void speedUp() {
		System.out.println("speed increased");
	}

	@Override
	public void roboticBike() {
		System.out.println("Robotic bike has started");
	}
}

public class Interface {

	public static void main(String[] args) {
		Remote r = new Remote();
		r.speedUp();
		r.electricSupport();//calling default method
		r.roboticBike();
		
	}

}
