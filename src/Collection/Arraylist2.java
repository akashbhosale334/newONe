package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {

		ArrayList<Integer> in= new ArrayList<> ();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		
		System.out.println(in);
		
		for(int i:in)
		{
	System.out.println(i);	
	}
Iterator<Integer>in1=in.iterator();
while(in1.hasNext())
    {
	System.out.println(in1.next());
	
	}	
	}
}
