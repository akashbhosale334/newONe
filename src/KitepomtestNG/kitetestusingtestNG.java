package KitepomtestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class kitetestusingtestNG {
 
WebDriver driver;
KIteloginpage    login;
Pinpagekite2     pin;
HomePageKitepage home;
org.apache.poi.ss.usermodel.Sheet Mysheet;


  @BeforeClass
        public void Launchbrowser() throws EncryptedDocumentException, IOException
        {
	  Reporter.log("launching browser",true);
System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	  Reporter.log("browser launched successfully",true);
		FileInputStream MyFile= new FileInputStream("D:\\selenium java drivers\\test2.xlsx");
        Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
        login=new KIteloginpage(driver);
     	pin =new Pinpagekite2(driver);
     	home=new HomePageKitepage(driver);//lazy intialization  pagefactory cha
  }
@BeforeMethod

public void logintokiteapp()//OBJECT DECLARED
{
	String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String PASSWORD = Mysheet.getRow(0).getCell(1).getStringCellValue();
	String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	Reporter.log("Entering userid and password",true);
	login.Enteruserid(USERID);//method call
	login.eneterpassword(PASSWORD);
    login.clickonloginButton();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    Reporter.log("entering pin",true);
	pin.enterpin(PIN);
	pin.clickoncontinuebutton();
	}

@Test 
public void validateuserId()//expected data
{
	Reporter.log("validating user",true);
	String expecteduserid = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserid = home.getactualUserid();
	
	Assert.assertEquals(actualUserid, expecteduserid,"actual and expecte user id not matching");
	Reporter.log("user id validated successfully,tc passed",true);
}
@AfterMethod 
public void logoutfromkiteapp() throws InterruptedException
{
	Reporter.log("logging out",true);
	home.logout();
}
@AfterClass
public void closebrowser()
{
	Reporter.log("closing browser",true);
	driver.close();
	
	}
}
