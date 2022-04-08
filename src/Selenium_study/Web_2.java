package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	
		
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ak@45");

//	driver.findElement(By.name("username")).sendKeys("ak45");
//	Thread.sleep(2000);
		
//	driver.findElement(By.className("Password"))
		
		
		}

}
