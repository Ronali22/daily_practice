package com.InterviewPractice;

//note- resolving method call at compile time is known as compile time polymorphism.
// resolving method call at run time is known as run time polymorphism.
class Watch{
	void digital() {
		System.out.println("buying digital watch");
	}
	void digital(int a) {
		System.out.println("buying two "+a+" set digital watch");
	}
}
class DigitalWatch extends Watch{
	@Override
	void digital() {
		System.out.println("buying new digital watch");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Watch w=new Watch();
		w.digital();
		w.digital(2);
		
		DigitalWatch d=new DigitalWatch();
		d.digital(); 

	}

}
