package testngGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "regression")
	  public void TC1() 
	  {
		  Reporter.log("Running TC1", true);
	  }
	@Test(groups="sanity")
	  public void TC2() 
	  {
		  Reporter.log("Running TC2", true);
	  }@Test(groups= {"sanity","regression"})
	  public void TC3() 
	  {
		  Reporter.log("Running TC3", true);
	  }@Test
	  public void TC4() 
	  {
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
