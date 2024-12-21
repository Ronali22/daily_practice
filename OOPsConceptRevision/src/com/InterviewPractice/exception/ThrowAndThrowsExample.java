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
	public static void main(String[] args) throws DemoException {
		int a = 100;
		int b =0;
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			throw new DemoException("exception occured while dividing");
		}
		System.out.println("äbc");
	}
}
