package control_statements;

public class Nest {

	public static void main(String[] args) {
		String Username="mock5";
		String Password="A555";
		int captcha =0000;
		if(Username=="mock5")
		{
			System.out.println("user name is correct\n enter password"+Username);
			
			
			if(Password=="A555")
			{
				System.out.println("enter captcha");
				
				if(captcha==0000)
				{
					System.out.println("login success welcome");
					System.out.println("=======================");
				}
				else
				{
					System.out.println("incorrect captcha");
				}
				
				
			}

			else
			{
				System.out.println("incorrect password");
			}
			
		}
		else
		{
			System.out.println("incorrect username");
		}
	}

}
