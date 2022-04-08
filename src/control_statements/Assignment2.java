package control_statements;

public class Assignment2 {

	public static void main(String[] args) {
		char grade='A'; 
	
switch (grade)
{
case 'A':System.out.println("marks obtained are>=75");
	break;

case 'B':System.out.println("marks obtained are>=60 to<=75 ");
	break;
	
case 'C':System.out.println("marks obtained are>55 to<=60");
	break;
	
	
case 'D':System.out.println("marks obtained are>35 to <=45");
{
	System.out.println("=============================================");}
	break;
default:System.out.println("=====category not defined or failed===");
	break;
}
}
	}


