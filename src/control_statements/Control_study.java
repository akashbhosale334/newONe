package control_statements;

public class Control_study {

	public static void main(String[] args) 
	{
	//syntax--->
		//if (condition)
		//{
			//block of code is to be generated if the condition is true
		//if marks are greater than 40, then it will be pass
		int marks=62;
		
				
		if (marks>40&marks<60)

		{
			System.out.println("I am in 2nd class");
		System.out.println("your marks are >=75");
}
		else if (marks>60&marks<75)
		{
			System.out.println("I am 1st class");

}
		else if (marks>=75) 
		{
			System.out.println("I am in  passed with Distn");
		}
		else
		{
			System.out.println("i am failed");
		}
	}
	
}
