package Abstract_bank;

public class Sprint03 extends Sprint1{
//u can create object in same class where u are going to complete the incomplete abstract
	public static void main(String[] args)
	{
Sprint03 sp = new Sprint03();
sp.Bank_statement();
sp.Account_activity();
sp.fd();
sp.UPI_transfer();
	}

	@Override
	public void UPI_transfer()
	{
	System.out.println("this method is upi transfer in sprint03");	
	}
public void fd()
{
	System.out.println("this method is fd in sprint03");
}
}

