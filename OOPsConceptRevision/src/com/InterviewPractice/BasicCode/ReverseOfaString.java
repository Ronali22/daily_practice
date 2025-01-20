package com.InterviewPractice.BasicCode;

public class ReverseOfaString {

	public static void main(String[] args) {
		String s = "Ronali";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			r = r+ch;
		}
		System.out.println(r);
	}

}
