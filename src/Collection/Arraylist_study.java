package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_study {

	public static void main(String[] args) 
	{
			
ArrayList al =new ArrayList<>();
al.add("Velocity");
al.add(123.123);
al.add("Pune");
al.add("katraj");
al.add("B");
al.add(null);
al.add(null);


System.out.println(al);
System.out.println(al.size());

al.add("massive");
al.add(0, "GOOD MORNING");
System.out.println(al);

al.remove(0);
//al.remove("GOOD MORNING");
System.out.println(al);

System.out.println(al.contains("B"));
System.out.println(al.contains("Z"));
System.out.println(al.isEmpty());
System.out.println(al.get(5));

//if wantto call all methods use for loop   object=size-1
System.out.println("============Usingloop===============");
for(int i=0;i<=al.size()-1;i++)
{
	System.out.println(al.get(i));
	}
System.out.println("=============using iteratar=========");
Iterator it =al.iterator();//using iterator
while (it.hasNext())
{
	System.out.println(it.next());
}

System.out.println("=========using for each loop========");
for(Object o:al)
	
{
	System.out.println(o);
	}




	}

}
