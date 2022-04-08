package Polymorphism;

public class Overloading_study {

	public static void main(String[] args) {
Overloading_study  o =new Overloading_study();
o.add();
o.add();
o.add(105.2f, 25.02f);
o.add(10, 20);
o.add(20, 20);
o.add(20.5f, 10.5f);
	}
public void add()// with zero parameters
{
int a=10;
int b=20;
int sum=a+b;
	System.out.println("Sum is "+sum);
	}
public void add(int a, int b)//with two integer  parameters
{
int sum =a+b;
System.out.println("Sum is "+sum);
}
public void add(float a, float b)//with two float parameters
{
float sum =a+b;
	System.out.println("Sum is "+sum);}
}
