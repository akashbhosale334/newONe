package control_statements;

public class Switch_study {

	public static void main(String[] args) {
		//1st example
		//if my year is 
		//1:i am in 1st year of engineering
		//2: am in 2nd year of engineering
		//3:i am in 3rd year of engineering
         //4:i am in 4th year of engineering
		//this is 2nd example of months
//please enter valid value between 1-4----->default
		int month=6;
		switch (month) {
		case 1:System.out.println("month is january");
		break;

		case 2:System.out.println("month is february");
		break;
		
		case 3:System.out.println("month is march");
		break;
		
		case 4: System.out.println("month is april");
	   break;
			
		case 5:System.out.println("month is may");
		break;
		
		case 6:System.out.println("this june");
		break;
		
		case 7:System.out.println("this is july");
		break;
		
		case 8:System.out.println("this is august");
		break;
		
		case 9:System.out.println("this is september");
		break;
		
		case 10:System.out.println("this is october");
		break;
		
		case 11:System.out.println("this is november");
		break;
		
		case 12:System.out.println("this is december");
		break;
		default:System.out.println("please enter valid value between 1-13");
		break;
		}
	}

}
