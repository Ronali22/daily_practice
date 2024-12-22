package com.InterviewPractice.multithread;

//String userName;//varibale
//String userName();//abstract method
//String userName(){};//concrete method
//new UserName();//class obejct creation

class MyThread1 extends Thread{//creating thread using Thread class
	public void run() {
		for(int i = 1; i<=100;i++) {
			System.out.println(i);
		}
	}
}

class MyThread2 implements Runnable{//creating thread using Runnable interface

	@Override
	public void run() {
		for(int i = 1001; i<=1100;i++) {
			System.out.println(i);
		}
	}
	
}

public class MultithreadingExample {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		MyThread2 t2 = new MyThread2();
		Thread myThread = new Thread(t2);
		myThread.start();
		
	}
}