package KiteApptestclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base;
import KiteappusingPOMandDDF.KIteloginpage;
import UtilityPackage.Utility;

public class KiteappuserIDErrorMsgValidation extends Base{
	KIteloginpage login;
	
	@BeforeClass
	public void LauchBrowser()
 {
		launchBrowser();
       login = new KIteloginpage(driver);
  }
	@BeforeMethod
	public void logintokiteapp() throws EncryptedDocumentException, IOException
	{
		login.eneterpassword(Utility.readDataFromExcel(0, 1));
		login.clickonloginButton();
	}
	@Test
	public void validateUserIDerrorMsg() throws EncryptedDocumentException, IOException
	{
		int TCID=200;
		String expectedUserIDerrorMsg= Utility.readDataFromExcel(0,4);
		String actualUserIDerrorMsg = login.getUserIDErrorMsg();
		Assert.assertEquals(actualUserIDerrorMsg, expectedUserIDerrorMsg,"Error msg is not matching");
        Utility.takeScreenshot(driver, TCID);
       Reporter.log("validateuseriderror",true);
        }
//	@Test
//	public void validatepasswordErrorMsg() throws EncryptedDocumentException, IOException
//	{
//		int TCID=201;
//		String expectedpassworderror = Utility.readDataFromExcel(0, 5);
//		String actualpassworderror = login.getpasswordStringerrormsg();
//		Assert.assertEquals(actualpassworderror, expectedpassworderror);
//		Utility.takeScreenshot(driver,TCID);
//       // Reporter.log("validatepasswordErrorMsg",true);
//
//	}
		@AfterClass
		public void browserClosing()
		{
			closeBrowser();
		}
	}

