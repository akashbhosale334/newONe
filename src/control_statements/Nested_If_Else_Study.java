package control_statements;

public class Nested_If_Else_Study {

	public static void main(String[] args) {
	String Username="akash bhosale";
	String Password="0000@1234";
	if(Username=="akash bhosale")
	{
		System.out.println("Username is correct ,please enter password");
		if (Password=="0000@1234")
		{
			System.out.println("correct password, login sucess");
		}
		else
		{
			System.out.println("please check your Password");
		}
		}
		else
		{
			System.out.println("incorrect Username");
		}
		
	}
	}

