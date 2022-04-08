package failedxml;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class failedxmlstudy {
	@Test
	  public void TC1() 
	  {
		  Reporter.log("Running TC1", true);
	  }
	@Test(timeOut = 100)
	  public void TC2() throws InterruptedException 
	  {
		Thread.sleep(50);
		  Reporter.log("Running TC2", true);
	  }@Test
	  public void TC3() 
	  {
		  Reporter.log("Running TC3", true);
	  }@Test
	  public void TC4() 
	  {
		Assert.fail();
		  Reporter.log("Running TC4", true);
	  }
	  @Test
	  public void TC5() 
	  {
		  Reporter.log("Running TC5", true);
	  }
	  @Test
	  public void TC6() 
	  {
		  Reporter.log("Running TC6", true);  
	  }
	  @Test
	  public void TC7() 
	  {
		  Reporter.log("Running TC7", true);
	  }
	  @Test
	  public void TC8() 
	  {
		  Reporter.log("Running TC8", true);
	  }
	  @Test
	  public void TC9() 
	  {
		  Reporter.log("Running TC9", true);
	  }

}
