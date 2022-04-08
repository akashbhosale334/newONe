package array_study;

public class Array_test {

	public static void main(String[] args) {

		
	 String name1="Velocity";
	 String name2="Corporate";
	 String name3="training";
	 String name4="Centre";
	 
	 int Salary=50000;
	 
	 //1. declaration
	 String institute[]=new String[5];
	 
	 //2. initialization
	 institute[0]="Velocity";                  //max index=length-1
	 institute[1]="Corporate";
	 institute[2]="training";
	 institute[3]="Centre";
	 
	 //3. usage
	 System.out.println(institute[0]);
	 System.out.println(institute[1]);
	 System.out.println(institute[2]);
	 System.out.println(institute[3]);
	System.out.println("================="); 
	 
	 for (int i=0;i<=3;i++)
	 {
		 System.out.println(institute[i]);
		System.out.println("==============");
	 }
	
	 

	}

}
