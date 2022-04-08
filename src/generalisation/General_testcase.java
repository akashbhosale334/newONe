package generalisation;

public class General_testcase {

	public static void main(String[] args) {

		Jio j =new Jio();
		j.call();
		j.data();
		j.sms();
		System.out.println("jio sim rate is "+TRAI.SIM);
		
		Airtel a =new Airtel();
		a.call();
		a.data();
		a.sms();
		a.airtelmoney();
		System.out.println("Airtel sim rate is "+TRAI.SIM);
		
		
	}
}
