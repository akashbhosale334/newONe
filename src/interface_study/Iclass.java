package interface_study;

public class Iclass implements Myinterface {

	public static void main(String[] args)
	{
		Iclass ic= new  Iclass ();	
		 ic.test();
		 ic.test1();
		 ic.test3();
		 ic.demo();
	}
	public void demo()//own method of implementation class
	{
		System.out.println("own method of implentation class");
		}
		
	public void test() 
	{
		int a=10;
		int b=20;
		a=a+b;
		System.out.println("sum is "+a);
	}

	
	public void test1()
	{
		int a=20;
		int b=10;
		b=a-b;
		System.out.println("subtraction is "+b);
	}

	
	public void test3()
	{
		int a=10;
		int b=10;
		b=a*b;
		System.out.println("multipictaion is "+b);
	}

}
