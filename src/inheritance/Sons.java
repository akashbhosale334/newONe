package inheritance;

public class Sons extends Mother{

	public static void main(String[] args)
	{
Sons s =new Sons();
s.laptop();
s.money();// calling super class property using sub class object
s.looks();//   calling super class property using sub class object
  nature();  // cLLING SUPER Class static property in sub class
 
	}
public void laptop()
{
	System.out.println("sons laptop");
	}
}
