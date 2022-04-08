package testng.testng.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	@Test(priority = 1)
	  public void a()
	  {
		  Reporter.log("Running A method", true);
	  }
	 
	  @Test(priority = -9,invocationCount = 3,timeOut = 2000)
	  public void c()
	  {
		  Reporter.log("Running C method", true);
	  }
	  @Test(priority = -1)
	  public void b()
	  {
		  Reporter.log("Running B method", true);
	  }
}
