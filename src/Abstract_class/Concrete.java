package Abstract_class;

public class Concrete extends Sample1 {

	public static void main(String[] args)
	{
Concrete c= new Concrete();
 c.test1();
 c.test2();
 c.test3();
 test4();
 c.test5();

	}
public void test5()
{
	System.out.println("method from concrete method");
	}

@Override
public void test3() {
System.out.println("test3 method is completed in concrete class");	
}
}
