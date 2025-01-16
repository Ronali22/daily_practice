package com.InterviewPractice.example;

import java.util.Scanner;

public class MethodExample1 {
	
	public String name() {
		Scanner sc = new Scanner(System.in);// scanner class is used to take input from user.
		String userName = sc.next();//taking input from user
		System.out.println("user has entered : "+userName);
		return userName;
	}

	public static void main(String[] args) {
		MethodExample1 me = new MethodExample1();
		String un = me.name();
		System.out.println(un);
	}

}
