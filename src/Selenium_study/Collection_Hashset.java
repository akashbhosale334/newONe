package Selenium_study;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_Hashset {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		
		h.add(100);
		h.add("Velocity");
		h.add("a");
		h.add(100);// added duplicate
		h.add(66.7f);
	    h.add(null);
	    h.add(null);
			
			
			System.out.println(h);
			System.out.println(h.size());
			System.out.println(h.contains('A'));
			System.out.println(h.isEmpty());
			System.out.println(h);
			System.out.println(h.remove('A'));
			System.out.println(h);
		System.out.println("==========================");	
			Iterator it= h.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
System.out.println("====================================");
			for(Object o:h)
			{
				System.out.println(o);
			}
System.out.println("===================================");

h.clear();
System.out.println(h);
System.out.println(h.isEmpty());



	}

}
