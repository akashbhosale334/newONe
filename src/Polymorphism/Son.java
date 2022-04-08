package Polymorphism;

public class Son extends Father{//overriding example

	public static void main(String[] args)
	{
Father f =new Father();//super class objects
Son s =new Son();//sub class object
f.money();
s.money();
s.money();	}
public void money()
{
	System.out.println("sons money 12L");
	}
}
