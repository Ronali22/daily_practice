package com.InterviewPractice.revision;

import java.util.ArrayList;
import java.util.stream.Collectors;

//Homework:
//1. create a Car class with properties name,price. add setter getter and tostring methods.
//then create 5 objects and store them inside an arraylist.
//then print all the car objects.

class Car {
	private String name;
	private float price;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "Car details: " + name + " " + price;
	}
}

public class SampleCode {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setName("nexon");
		c1.setPrice(50000.50f);

		Car c2 = new Car();
		c2.setName("tiago");
		c2.setPrice(40000.50f);

		Car c3 = new Car();
		c3.setName("tigor");
		c3.setPrice(35000.50f);

		Car c4 = new Car();
		c4.setName("harier");
		c4.setPrice(70000.50f);

		Car c5 = new Car();
		c5.setName("safari");
		c5.setPrice(60000.50f);

		ArrayList<Car> al = new ArrayList<>();
		al.add(c1);// inserting element into arraylist
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
//		System.out.println(al.get(4));//fetching element from arraylist using index

//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);

//		1st way of printing all the elements present inside arraylist
//		System.out.println(al);

//		2nd way(using for loop)
//		for(int i=0;i<5;i++) {
//			System.out.println(al.get(i));
//		}

//		3rd way(using enhanced for loop)
		for (Car c : al) {
			System.out.println(c);
		}

	}
}
