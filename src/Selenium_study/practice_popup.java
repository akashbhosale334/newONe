package Selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver= new ChromeDriver();
	      
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html ");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			
			WebElement popup = driver.findElement(By.id("at-cv-lightbox-close"));
			Thread.sleep(2000);
			popup.click();
			
			
	}

}
