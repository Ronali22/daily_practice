package com.InterviewPractice.example;

import java.util.List;
import java.util.function.Predicate;

// WAP to print student names starting with A.
public class LambdaExpressionAndMethodReferenceExample3 {

	public static boolean checkName(String name) {
		if (name.charAt(0) == 'A')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		List<String> sl = List.of("Akash", "Bikash", "Kailash", "Anil", "Amrut");
//		Predicate<String> p=name->name.charAt(0)== 'A';
		Predicate<String> p = LambdaExpressionAndMethodReferenceExample3::checkName;//on static context
		
//		LambdaExpressionExample3 le = new LambdaExpressionExample3();//on non-static context(remove static keyword from checkName)
//		Predicate<String> p = le::checkName;

		for (String studentName : sl) {
			if (p.test(studentName))
				System.out.println(studentName);
		}

	}

}
