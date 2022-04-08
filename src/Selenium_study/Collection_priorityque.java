package Selenium_study;

import java.util.PriorityQueue;

public class Collection_priorityque {

	public static void main(String[] args) {
PriorityQueue pq= new PriorityQueue();
		
		pq.add("abc");
		pq.add("pqr");
		pq.add("lmn");
		pq.add("xyz");
		pq.add("aaa");
		//pq.add(100);
		
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		pq.poll();
		System.out.println("remove method "+pq.remove());
		pq.poll();
		pq.poll();
		System.out.println(pq);
		pq.remove();
		//pq.poll();
		//pq.remove();
		pq.poll();
		System.out.println(pq);

	}

}
