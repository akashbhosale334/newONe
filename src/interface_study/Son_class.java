package interface_study;

public class Son_class implements Father, Mother{

	public static void main(String[] args) {
Son_class sn =new Son_class();
sn.looks();
sn.money();
sn.nature();
sn.property();
Father.intelligence();//calling static complete method from interface
Mother.intelligence();//syntax      classname.method name

	}

	@Override
	public void nature() {
System.out.println("mothers nature completed in sons class ");		
	}

	@Override
	public void property() {
//to call specific method from default method from super interface follow syntax
//interfacename.super.methodname
Father.super.property();//calling default property method from father 
Mother.super.property();//calling default property method from mother 
//super keyword is us to access global variable from 
//super keyword cant be used in static so in method 
	}

	@Override
	public void money() {
System.out.println("fathers money completed in sons class ");		
	}

	@Override
	public void looks() {
System.out.println("fathers  looks completed in sons class");		
	

	
	}

}
