package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		//only main page and PArent frame
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		
		//switch focus of selenium from main page to iframe
		driver.switchTo().frame("iframeResult");//name="iframeResult"
		Thread.sleep(3000);
		
		WebElement aboutbutton = driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]"));
		Thread.sleep(2000);
		aboutbutton.click();
		
		//switch the Focus from iframe to main(page)
		
	driver.switchTo().defaultContent();//for main page only use default content
	//change the theme
	WebElement theme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
	Thread.sleep(2000);
	theme.click();
	}

}

