package com.InterviewPractice.revision;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//WAP from the given list of integers, print the numbers which are multiple by 5.
//WAP to find maximum and minimum of these given integers

public class NumberMultiplesOf5 {

	public static void main(String[] args) {
		List<Integer> listOfInteger= List.of(50,105,76,39,500,29);
		
//		multiple by 5
		listOfInteger.stream().filter(e->e % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);
		
		//find maximum
		Integer max = listOfInteger.stream().sorted((a,b)->b-a).findFirst().get();
		System.out.println(max);
		
		//find minimum
		Integer min = listOfInteger.stream().sorted((a,b)->a-b).findFirst().get();
		System.out.println(min);
		
	}

}
