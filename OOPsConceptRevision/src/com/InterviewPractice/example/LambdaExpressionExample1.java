package com.InterviewPractice.example;

//with out lambda expression
interface Car1{
	void startEngine();
}
public class LambdaExpressionExample1 implements Car1{
	
	@Override
	public void startEngine() {
		System.out.println("enigine started");
	}
	
	public static void main(String[] args) {
		Car1 c1 = new  LambdaExpressionExample1();
		c1.startEngine();
	}
}
