package generalisation;

public class Airtel implements TRAI {

	@Override
	public void call() {
System.out.println("unlimited calls in airtel");		
	}

	@Override
	public void data() {
System.out.println("airtel data 1gb/day");		
	}

	@Override
	public void sms() {
System.out.println("airtel 100sms/day");		
	}
public void airtelmoney()
{
	System.out.println("Airtel money service");
	}
}
