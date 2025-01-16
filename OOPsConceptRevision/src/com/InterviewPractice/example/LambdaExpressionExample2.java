package com.InterviewPractice.example;

import java.util.function.Predicate;

//class PredicateDemo {
//	public boolean test(int i) {
//		if (i % 2 == 0))
//		else
//			return false;
//	}
//}

public class LambdaExpressionExample2 {
	
	public static void main(String[] args) {
//		PredicateDemo pd = new PredicateDemo();
//		boolean result = pd.test(5);
//		System.out.println(result);
		
		//byusing lambda expression and functional interface
		 Predicate<Integer> p = i -> i % 2 == 0;
		 System.out.println(p.test(10));
	}
	
}
