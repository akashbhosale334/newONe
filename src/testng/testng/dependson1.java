package testng.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependson1 {
  @Test (priority = 1)
  public void login() {
	  Reporter.log("login success",true);
  }
  @Test(priority =2)
  public void verifypin()
  {
	Reporter.log("pin verified",true);  
  }
  @Test(dependsOnMethods = "login")
  public void logout()
  {
	  Reporter.log("logout success",true);
  }
}
