package Access_specificers;

public class AS2 {

	public static void main(String[] args) {
AS1 s1 =new AS1();//object of AS1 class
//s1.test4()  private members are only visible within the class
s1.test1();
s1.test2();
s1.test3();

System.out.println("calling default member of AS1 class"+s1.a);
System.out.println("calling public memeber of AS1 class "+s1.b);
System.out.println("calling private member of AS1 class "+s1.c);
//System.out.println(" calling private member of AS1 class is not possible");
	}

}
