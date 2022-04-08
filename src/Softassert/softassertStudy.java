package Softassert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertStudy {
SoftAssert  s= new SoftAssert();//created object of soft assert class

@Test
public void MyMethod()
{
	String a="Pune";
	String b="Pune1";

	s.assertEquals(a, b,"a b r not equal");
	Reporter.log("a and b are not equal",true);

	//till using this s.assert all it will show pass tc
	s.assertAll();//fail
	}
}
