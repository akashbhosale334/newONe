package Selenium_study;

import java.util.PriorityQueue;

public class Collection_priorityqueue {

	public static void main(String[] args) {
PriorityQueue pr =new PriorityQueue();
      pr.add("abc");
      pr.add("abc");
      pr.add("akash");
      pr.add("xyz");
    //  pr.add(null);
    //  pr.add(100);
      
      System.out.println(pr);
      System.out.println(pr.element());
      System.out.println(pr.poll());
      System.out.println("==============");
     System.out.println(pr);
     System.out.println("=================");
    System.out.println(pr.peek());
    System.out.println(pr);
//System.out.println("==============");      
////pr.poll();
//System.out.println("remove method "+pr.remove());
//pr.poll();
//System.out.println(pr);
////pq.poll();

	}

}
