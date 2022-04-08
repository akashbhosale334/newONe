package casting;

public class Son extends Father_class{

	public static void main(String[] args)
	{//creating object of sub class and giving super class property
		Father_class fc =new Father_class();//creating object of fatherclass
		fc.money();
		
		Son s = new Son();//creating object of son class
		s.money();
		s.bike();//calling own property
		
		Father_class f1 =new Son();//upcasting
		//reference    sons object
		f1.money();
	//	f1.bike();//we cant call the method which is not common
	}
public void money()//overrided
{
	System.out.println("sons money 10l");
	
	}
public void bike ()//own property
{
	System.out.println("sons bike ");
	}
}