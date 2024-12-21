package com.InterviewPractice;

class Bank {
	
	private String userName;
	
	private int userId;
	
	private String userAddress;

	public void setUserName(String name) {
		this.userName = name; // this keyword is used to refer same class non static variable.
	};

	public void setUserId(int id) {
		this.userId = id;
	}

	public void setUserAddress(String add) {
		this.userAddress = add;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public String toString() {
		return userName + " " + userId + " " + userAddress;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setUserName("Raju");
		bank.setUserId(2024);
		bank.setUserAddress("bbsr");
		System.out.print(bank);
		;

//		System.out.println(bank.getUserName());
//		System.out.println(bank.getUserId());
//		System.out.println(bank.getUserAddress());
		
	}
}
