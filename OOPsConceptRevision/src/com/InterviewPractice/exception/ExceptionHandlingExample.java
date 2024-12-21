package com.InterviewPractice.exception;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int c = 0;
//		try {
//			c = a / b;// risky code
//		} catch (ArithmeticException e) {
//			System.out.println("inside ArithmeticException's catch block");
//		} catch (Exception e) {
//			System.out.println("inside Exception's catch block");
//			c = c + 15;
//		} finally {
//			System.out.println("thank you");
//		}
		try {
			c = a / b;// risky code
		} catch (ArithmeticException | NullPointerException e) {//multiple exceptions can be present inn a single catch byusing "or" operator.
			System.out.println("inside catch block");
		} finally {
			System.out.println("thank you");
		}
		System.out.println(c);
		System.out.println("working");
	}

}
