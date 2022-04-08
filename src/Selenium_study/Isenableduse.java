package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenableduse {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
        WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		SignInButton.click();
		Thread.sleep(3000);
		WebElement getOTPBUTTON = driver.findElement(By.tagName("button"));
       // System.out.println(getOTPBUTTON.isEnabled());//if we want to print only

	    boolean result =getOTPBUTTON.isEnabled();
		System.out.println("get otp button is "+result);
		
	if(result) 		
	{

	}
	else
	{
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9999999999");
		Thread.sleep(20000);
	getOTPBUTTON.click();
	boolean result1 =getOTPBUTTON.isEnabled();
	System.out.println("clicked on the otp button" +result1);
	}	
	
	}
}