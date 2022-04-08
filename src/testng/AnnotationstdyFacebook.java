package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationstdyFacebook {
  @Test
  public void validateuserid()
  {
	  Reporter.log("Running test true",true);
  }
  @BeforeMethod
  public void logininfacebook()
  {
	  Reporter.log("loggin in",true);
  }
  @BeforeClass
  public void launchbrwser() {
	  Reporter.log("launching browser....");
  }
  @AfterClass
  public void closebrowser() {
	  Reporter.log("closing browser...");
  }
  @AfterMethod
  public void logout() {
	  Reporter.log("loggiing out");
  }
}
