package globalvariable_practice;

public class gvariable
{
static int a=40;//static variables
String name ="fvariables";//non static variables
 int b=50;

	public static void main(String[] args) 
	{
		//System.out.println("value of a is "+a);//calling static
		gvariable gv= new gvariable();//object creation only for non static method
		gv.type1();
		//System.out.println("value of b is "+gv.b);//calling non static method
		type2();
	//	System.out.println("value of string is "+gv.name);
		}
public void type1()//non static method 
{
	int c=10;
	int d=10;
	int sum=c+d+b+a;
	System.out.println("type1 method is "+sum);
}
public static void type2()//static 
{
	int e=25;
	int f=50;
	int g=75;
	int mul=e*f*g*a;
	System.out.println("type 2 method is "+mul);
}}//local 