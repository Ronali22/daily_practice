package com.InterviewPractice;

	class Vehicle{
	 	String type = "petrol";
	 	int identficationNumber = 5536;
	}

	class Car extends Vehicle{
		String company = "tata";
	}

	class Tata{
	}
	public class Inheritance {
		public static void main(String[]args){
			Vehicle v = new Car(); //storing child type object into parent type reference is known as upcasting.
			Car c= (Car) v; // converting parent type object into child type is known as downcasting.
		System.out.println(c.company);

	}
}
