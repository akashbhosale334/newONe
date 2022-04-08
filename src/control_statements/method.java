package control_statements;

public class method {

	public static void main(String[] args) {
		method st= new method();
		st.tgrade();
	}
public void tgrade()
{
	char Grade='E';
	if(Grade=='A')
	{
		System.out.println("your marks are>75");
	}
	else if(Grade=='B')
	{
		System.out.println("your marks are>60 to <=75");
	}
	else if(Grade=='C')
	{
		System.out.println("your marks are>40to<=60");
	}
	else 
	{
		System.out.println("i am failed");
	}
	}
}
