package generalisation;

public class Jio implements TRAI{

	@Override
	public void call() {
System.out.println("jio call unlimited");		
	}

	@Override
	public void data() {
System.out.println("jio data 1.5gb/day");		
	}

	@Override
	public void sms() {
		System.out.println("jio 100sms/day");
	}

}
