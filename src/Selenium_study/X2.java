package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cvbucpsc.tatamotors.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Akash05");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ak0052A@");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

