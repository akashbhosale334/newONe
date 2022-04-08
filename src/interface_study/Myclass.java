package interface_study;

public class Myclass implements Interface2{

	public static void main(String[] args) {
Myclass m1 = new Myclass();
m1.m1();
m1.m2();
m1.m3();
m1.m4();
	}

	
	public void m1() {

System.out.println("m1 from interface1 completed in implementation");		
	}

	
	public void m2() {
System.out.println("m2 from interface1 completed in implementation");		
	}

	public void m3() {
System.out.println("m3 from interface2 completed in implementation");		
	}

	
	public void m4() {
System.out.println("m4 from interface2 completed in implementation");		
	}

}
