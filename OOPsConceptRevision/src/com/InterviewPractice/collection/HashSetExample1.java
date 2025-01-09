package com.InterviewPractice.collection;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet<>();//stores element in random order(internally uses hashing technique)
//		HashSet <Integer> hs=new LinkedHashSet<>();//stores elements in insertion order
		hs.add(50);
		hs.add(65);
		hs.add(47);
		hs.add(15);
		System.out.println(hs);
		
		SortedSet <Integer> ss=new TreeSet<>();
		ss.add(50);
		ss.add(65);
		ss.add(47);
		ss.add(15);
		System.out.println(ss);
	}

}
