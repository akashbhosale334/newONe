package Selenium_study;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection_treeset {

	public static void main(String[] args) {

		TreeSet ts= new TreeSet();
		
		ts.add("AKSHAY");
	//	ts.add(200);   integer not accepted
		ts.add("MAyur");
		ts.add("Umang");
		ts.add("Umang");
		ts.add("rohit");
		ts.add("rohit");
   //   ts.add(null);  null value is not accepted
		
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
        System.out.println(ts.contains("AKSHAY"));		
        System.out.println(ts.pollLast());
        System.out.println(ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println("======================");

        Iterator it =ts.iterator();
        while(it.hasNext())
		{
			System.out.println(it.next());
		}
System.out.println("=================================");
        for(Object o:ts)
        {
			System.out.println(o);
		}
	}

}
