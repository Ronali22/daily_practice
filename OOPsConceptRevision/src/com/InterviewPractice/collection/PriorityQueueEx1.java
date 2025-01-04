package com.InterviewPractice.collection;

import java.util.*;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		pq.offer(56);
		pq.offer(65);
		pq.offer(98);
		pq.offer(10);
		pq.offer(25);
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
