package Selenium_study;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_linkhashset {

	public static void main(String[] args) {
LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(100);
		lh.add("velocity");
		lh.add('A');
		lh.add(null);
		lh.add(100);
		lh.add(null);
		lh.add('B');
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		System.out.println(lh.contains('B'));
		
		System.out.println(lh);
		System.out.println("====================");
	lh.remove(100);
		System.out.println(lh);
		System.out.println("=====================");
    Iterator it= lh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=========================");
		for(Object o:lh)
		{
			System.out.println(o);
		}
		
		lh.clear();
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());

	}

}
