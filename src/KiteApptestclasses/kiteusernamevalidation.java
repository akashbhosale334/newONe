package KiteApptestclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base;
import KiteappusingPOMandDDF.KIteloginpage;
import KitepomtestNG.Pinpagekite2;
import UtilityPackage.Utility;
import zerodhausingPOM.kiteHomePage3;

public class kiteusernamevalidation extends Base
{
  KIteloginpage login;
  Pinpagekite2 pin;
  kiteHomePage3 home;
  @BeforeClass
  public void browserLaunch()
  {
  launchBrowser();
  
  login=new KIteloginpage(driver);
  pin= new Pinpagekite2(driver);
  home= new kiteHomePage3(driver);
  }
  @BeforeMethod
  public void loginToKiteApp()throws EncryptedDocumentException,IOException
  {
  login.Enteruserid(UtilityPackage.Utility.readDataFromExcel(0,0));
  login.eneterpassword(UtilityPackage.Utility.readDataFromExcel(0, 1));
  login.clickonloginButton();
  pin.enterpin(Utility.readDataFromExcel(0, 2));
  pin.clickoncontinuebutton();
  }
  @Test
   public void validateUserName() throws IOException
  {
  int TCID=100;
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

  String actualUserID=home.validateUserId();
  String expectedUserID = Utility.readDataFromExcel(0, 0);
  Assert.assertEquals(expectedUserID,actualUserID,"Actual and Expected not matching");
  UtilityPackage.Utility.takeScreenshot(driver, TCID);
  Reporter.log("Validated UserName", true);
  }
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException 
  {
home.clickOnLogoutButton();
  Reporter.log("Logging out", true);
}
@AfterClass

  public void closingBrowser()
  {
  closeBrowser();
}
}
