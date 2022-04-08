package control_statements;

public class Nestedif_eg {

	public static void main(String[] args){
		//username
		//password
		//captcha
		String Username="Akashbhosale";
		String Password="A0000";
		int Captcha=1234;
		
		if(Username=="Akashbhosale")
		{
		System.out.println("enter Password");
		if(Password=="A0000")
		{
			System.out.println("enter captcha");
			if(Captcha==1234)
			{
				System.out.println("login sucess");
			}
		
		else
		{
			System.out.println("incorrect Captcha");
		}
			
		}
	else
	{
		System.out.println("incorrect Password");
	        }
		}
		
		else
		{
			System.out.println("incorrect Username");
		}
	
		
	}
}
	
	

	


