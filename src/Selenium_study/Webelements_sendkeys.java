package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webelements_sendkeys {//for facebook

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//input[@id='email']"));
	//   driver.findElement(By.name("email")).sendKeys("skjhdakjsh");
//	driver.findElement(By.id("email"));

//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ak@334");//by class
	//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("akash@334");
//	driver.findElement(By.id("pass")).sendKeys("5454");//by id
//	Thread.sleep(3000);
//	
//	driver.findElement(By.name("email")).clear();by name
//	driver.findElement(By.id("pass")).clear();
	
//	driver.findElement(By.tagName("button")).click();by tagname

	WebElement Username = driver.findElement(By.id("email"));//by using webelement method
	Username.sendKeys("ak@45");
	Thread.sleep(2000);
	Username.clear();
	Username.sendKeys("ak@95");
	
	WebElement Password = driver.findElement(By.id("pass"));
	Password.sendKeys("0000");
//	Thread.sleep(3000);
//	Password.clear();
//	Password.sendKeys("1234");

	//driver.findElement(By.linkText("Forgotten password?")).click();//locator link text
	driver.findElement(By.partialLinkText(" pass")).click();//locator 0f partial link
	}

}
