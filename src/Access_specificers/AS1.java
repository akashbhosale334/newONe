package Access_specificers;

public class AS1
{
int a=10;//default global variable
public int b=20;//public global variable
protected int c=30;//protected global variable
private int d=40;//private global variable
	public static void main(String[] args) 
	{
		AS1 s1 =new AS1();
		s1.test1();//public method ---->through project
		s1.test2();//default method--->within package---->cant access outside
		s1.test3();//protected method --->within package--->cant be accessed outside
		s1.test4();//private method--->only within class
System.out.println("default global variable a is "+s1.a);
System.out.println("public global variable b is"+s1.b);
System.out.println("protected global variable c is"+s1.c);
System.out.println("private global variable d is"+s1.d);


}
	public void test1()
	{
		System.out.println("public test1 method from AS1 class");
	}
	void test2()
	{
		System.out.println("default test2 method from As1 class ");
	}
	protected void test3()
	{
		System.out.println("protected test3");
	}
	private void test4()
	{
		System.out.println("private test method from As1 class");
	}
}