package inheritance;

public class Hierarchical {

	public static void main(String[] args)
	{
Child1 c1 =new Child1();
c1.laptop();//calling own method
c1.money();//calling super class method
Child2 c2 =new Child2();//creating object of sub class
c2.car();//calling own method 
c2.money();//calling super class using sub class object


Father.landproperty();
Child1.landproperty();
Child2.landproperty();
	}

}
