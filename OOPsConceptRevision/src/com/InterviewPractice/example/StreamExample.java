package com.InterviewPractice.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> sl = List.of("Akash", "Bikash", "Kailash", "Anil", "Amrut");
		List<String> result = sl.stream().filter(e->e.charAt(0)=='A').collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
