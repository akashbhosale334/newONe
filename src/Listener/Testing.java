package Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.listener.class)
public class Testing {
  @Test
  public void A()
  {
	  Reporter.log("TC A is Running,True");
  }
  @Test
  public void B()
  {
	  Assert.fail();
	  Reporter.log("TC B is Running,True");
  }
  @Test(dependsOnMethods = {"B"})
  public void C()
  {
	  Reporter.log("TC C is Running,True");
  }
}
