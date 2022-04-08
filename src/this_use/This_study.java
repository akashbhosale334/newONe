package this_use;

public class This_study{

	int a=20;//non static global variable
	static int b =30;//static global variable
	
	public static void main(String[] args)
	{
		This_study t = new This_study();
		t.sample();
		 
	}
public void sample()
{
	int b=500;
	int a=10;
	int sum =100+a;//---->using local value a=10
	System.out.println("Sum is using local variable "+sum);
	
	int sum1=500+this.a;//--->//using global value a=20
	System.out.println("Sum using global varaiable value "+sum1);
	int sub=2000-b;
	int sub1=1000-this.b;
	System.out.println("sub tration using local b is "+sub);
	System.out.println("subtraction using global b is "+sub1);
	}
	}
//we can use static variable... but cannot use it in static method

