package com.InterviewPractice.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<String> listOfNames = List.of("Akash", "Bikash", "Kailash", "Anil", "Amrut");
		Stream<String> stream = listOfNames.stream();
		List<String> result = stream.filter(element -> element.charAt(0) == 'A').collect(Collectors.toList());

//		print result in different ways:
		//System.out.println(result);
		
		//for(int i=0; i<=2; i++) {
			//System.out.println(result.get(i));
		//}
		
//		for (String s : result) {
//			System.out.println(s);
//		}
		
//		result.forEach(e->System.out.println(e));
		
		result.forEach(System.out::println);
		
		//above steps in single line
		listOfNames.stream()
					.filter(element -> element.charAt(0) == 'A')
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
	}
}
