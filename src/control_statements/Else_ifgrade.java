package control_statements;

public class Else_ifgrade {

	public static void main(String[] args)
	{
		Else_ifgrade jv = new Else_ifgrade();
				jv.testgrade();
		//testgrade();
	}
	public  void testgrade()	//for non static method
	{
		char Grade='E';
		if(Grade=='A')
		{
			System.out.println("your marks are >=75");
		}
		else if(Grade=='B')
		{
			System.out.println("your marks are>=60 to <=75");
		}
		else if (Grade=='C')
		{
			System.out.println("your marks are >40 to <60");
		}
		else 
		{
			System.out.println("i am failed");
		}
	}
}
