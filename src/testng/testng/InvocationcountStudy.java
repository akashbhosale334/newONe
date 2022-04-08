package testng.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationcountStudy {
  @Test
  public void f() {
  }
  @Test(invocationCount = 3)
  public void a() 
  {
	  Reporter.log("Running A method", true);
  }
  
  @AfterMethod
  public void afterMethod ()
  {
	  Reporter.log("After method running", true);
  }
}
