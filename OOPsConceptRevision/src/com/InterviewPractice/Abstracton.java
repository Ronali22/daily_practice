package com.InterviewPractice;

abstract class Animal {

	String animalType;

	public void wildAnimal() {
		System.out.println("wild animal spotted");
	}

	public void domesticAnimal() {
		System.out.println("domestic animal spotted");
	}

	abstract public String animalStructure();

}

class Dog extends Animal {
	
	private int legs;

	public void wildAnimal() {
		System.out.println("wild animal spotted");
	}

	public String animalBehavior() {
		System.out.println("animals barking");
		return "animalBehavior";
	}

	@Override
	public String animalStructure() {
		System.out.println("abcd");
		return "animalStructure`";
	};

}

public class Abstracton {
	
	public static void main(String args[]) {
		Animal a1 = new Dog();
		a1.domesticAnimal();
		a1.wildAnimal();
		System.out.println("-----");

	}
}
