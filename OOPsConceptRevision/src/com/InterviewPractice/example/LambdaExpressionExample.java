package com.InterviewPractice.example;

//with lambda expression
@FunctionalInterface
interface Car{
	void startEngine();
}
public class LambdaExpressionExample {
	public static void main(String[] args) {
		Car c1 = ()->System.out.println("engine started");
		c1.startEngine();
		
	}

}

//-> in line number 10, we are storing a function
//(i.e annonymous function/lambda expression) inside a variable.