package com.InterviewPractice.exception;

//checked exception example
class DemoException extends Exception {
	DemoException() {// constructor
		System.out.println("car exception occured");
	}

	DemoException(String msg) {
		System.out.println(msg);
	}
}

//unchecked exception example
class Demo2Exception extends RuntimeException {
	Demo2Exception() {// constructor
		System.out.println("car exception occured");
	}

	Demo2Exception(String msg) {
		System.out.println(msg);
	}
}

public class ThrowAndThrowsExample {
	public static int division(int a, int b) throws DemoException{
		return a / b;
	}

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		try {
			if (b == 0) {
				throw new Demo2Exception("exception occured");
			}
			int result = division(a, b);
			System.out.println(result);

		} catch (DemoException | Demo2Exception e) {
			System.out.println("inside catch block");
		}
		System.out.println("abc");
		System.out.println("abc");
		System.out.println("abc");
		System.out.println("abc");
	}
}
