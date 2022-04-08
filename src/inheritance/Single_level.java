package inheritance;

public class Single_level {

	public static void main(String[] args) 
	{
Mother m =new Mother();//creating object of mother class
       m.looks();
       m.money();	
Daughter d= new Daughter();//creating object using child class
      d.mobile();
      d.money();//calling super class property using child class
      d.looks();//same
      
      Mother.nature();
      Daughter.scooty();//calling static method from daughter class
      Daughter.nature();//using subclass name from static method from super class
      

}
}