package kitepomcrossbrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KitepomtestNG.HomePageKitepage;
import KitepomtestNG.KIteloginpage;
import KitepomtestNG.Pinpagekite2;

public class crossbrowsertestng {
	WebDriver driver;
	KIteloginpage    login;
	Pinpagekite2     pin;
	HomePageKitepage home;
	
	org.apache.poi.ss.usermodel.Sheet Mysheet;

@Parameters("BrowserName")
	  @BeforeClass
	        public void Launchbrowser(String browser) throws EncryptedDocumentException, IOException
	        {
	if(browser.equals("chrome"))
	{
		 Reporter.log("launching chromebrowser",true);
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--disable-notifications");
		 driver=new ChromeDriver(opt);
	}
	else if (browser.equals("firefox"))
	{
		Reporter.log("launching firefoxbrowser",true);
		System.setProperty("webdriver.gecko.driver","D:\\selenium java drivers\\geckodriver.exe");
	    FirefoxOptions opt= new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		driver =new FirefoxDriver(opt);
	}
		 
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
