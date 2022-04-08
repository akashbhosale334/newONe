package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIteTest {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
	   
     WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		Kiteloginpage login = new Kiteloginpage(driver);
		login.sendUserId();
		login.sendPassword();
		login.clickonloginbutton();
		Thread.sleep(2000);
		
		Kitepinpage pin = new Kitepinpage(driver);
		pin.sendpin();
		pin.clickOnContinueButton();
		Thread.sleep(2000);
		
		kiteHomePage3 home = new kiteHomePage3(driver);
		home.validateUserId();
		 home.clickOnLogoutButton();
		
		driver.close();
	}

}
