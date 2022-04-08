package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartiframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement Popbutton =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(2000);
		Popbutton.click();
		Thread.sleep(2000);
		
	WebElement	Cartbutton = driver.findElement(By.xpath("//span[text()='Cart']"));
	Thread.sleep(2000);
	Cartbutton.click();
	}
}
