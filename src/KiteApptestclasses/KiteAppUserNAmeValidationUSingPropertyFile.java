package KiteApptestclasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Baseclasses.BaseclassUsinProperties;
import KitepomtestNG.HomePageKitepage;
import KitepomtestNG.KIteloginpage;
import KitepomtestNG.Pinpagekite2;
import UtilityPackage.UtilityUSingPropertyFile;

public class KiteAppUserNAmeValidationUSingPropertyFile extends BaseclassUsinProperties {

	KIteloginpage login;
	Pinpagekite2 pin;
	HomePageKitepage home;
	int TCID=205;

@BeforeClass
  public void launchingBrower() throws IOException {
        launchBrowser();
        login= new KIteloginpage(driver);
        pin= new Pinpagekite2(driver);
        home =new HomePageKitepage(driver);
	}
@BeforeMethod
public void loginkitepageapp() throws IOException {
	
	login.Enteruserid(UtilityUSingPropertyFile.getDatafromPRopertyFile("UN"));
	login.eneterpassword(UtilityUSingPropertyFile.getDatafromPRopertyFile("PWD"));
	login.clickonloginButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	pin.enterpin(UtilityUSingPropertyFile.getDatafromPRopertyFile("PIN"));
	pin.clickoncontinuebutton();
}
@Test
  public void validateUSerID() throws IOException
  {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	String expectedUserid = UtilityUSingPropertyFile.getDatafromPRopertyFile("UN");
	String actualUserid = home.getactualUserid();
	//Assert.fail();//to take screenshot for if else condition
	Assert.assertEquals(expectedUserid, actualUserid,"Actual n expected Userid not matching");
	//UtilityUSingPropertyFile.takeScreenshot(driver, TCID);
  }
@AfterMethod
public void logoutformkiteapp(ITestResult result) throws InterruptedException, IOException
{
	if(result.getStatus()==result.FAILURE)
	{
		UtilityUSingPropertyFile.takeScreenshot(driver, TCID);
	}
	else
	{
	Reporter.log("Tc is Passed",true);	
	}
	//home.logout();
	}
@AfterClass
public void closingBrowser()
{
	closeBrowser();
//	}
//	  Reporter.log(UtilityUSingPropertyFile.getDatafromPRopertyFile("URL"),true);
//      Reporter.log(UtilityUSingPropertyFile.getDatafromPRopertyFile("UN"),true);
//      Reporter.log(UtilityUSingPropertyFile.getDatafromPRopertyFile("PWD"),true);
//      Reporter.log(UtilityUSingPropertyFile.getDatafromPRopertyFile("PIN"),true);

  }
  
}
