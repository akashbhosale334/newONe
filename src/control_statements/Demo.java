package control_statements;

import Access_specificers.AS1;

public class Demo extends AS1 {

	public static void main(String[] args)
	{
AS1 s1= new AS1();//created object of AS1 class
s1.test1();


Demo d = new Demo();//creating object of a sub class
d.test3();//calling protected method of AS1 class
d.test1();//calling public method of AS1 class
//d.test2();//cant call it is default access specifier
//d.test4();//cant call as it is a private access specifier
	}
}
