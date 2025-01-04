package com.InterviewPractice.Java8Features;

import java.time.*;
public class DateEx {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalDate ld2=ld.plusDays(100);
		System.out.println(ld2);
	}

}
