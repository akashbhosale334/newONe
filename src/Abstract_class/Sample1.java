package Abstract_class;

public abstract class Sample1 {

	public static void main(String[] args)
	{
		//Sample1 s= new Sample1();
		 
test4();

	}
public void test1()
{
	System.out.println("this is complete method");
	}
public void test2()
{
	//this is incomplete method
	}
public abstract void test3();
public static void test4()
{
	System.out.println("this is static method with body");
	}
}
//when there is abstract in a class we cannot create object