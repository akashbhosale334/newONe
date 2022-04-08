package Interface;

public class Final_keyword {
int a=50;//global variable
final int b=50;
	public static void main(String[] args)
	{
Final_keyword fk=new Final_keyword ();
    fk.add();
    fk.add1();
	}
public void add()
{
   a=a+30;
   System.out.println("value upon updation is"+a);
	}
public void add1()
{
//b=b+10;	in final keyword we cannot update value
	}
}
