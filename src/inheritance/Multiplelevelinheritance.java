package inheritance;

public class Multiplelevelinheritance 
{

	public static void main(String[] args)
	{
		Daughter d= new Daughter();
		d.experience();//calling from the supermost class
		d.looks();//calling property from super class
		d.money();
		d.mobile();//calling property from own class
		Daughter.nature();//calling property from static method from subclass using subclass name

		
		
		
		
	}

}
