package Selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctciterator {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(2000);
		
		Set<String> Newwindowadd= driver.getWindowHandles();
		//System.out.println("the id of all tab opened is"+Newwindowadd);
		Iterator<String> Address = Newwindowadd.iterator();
		
		String maintab = Address.next();
		System.out.println("Id of the main page displayed is "+maintab);
		Thread.sleep(2000);
		
		String Nxttab = Address.next();
		System.out.println("Id of the next page displayed is "+Nxttab);
		Thread.sleep(2000);
		
		driver.switchTo().window(maintab);
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys("akash bhosale");
		
		driver.switchTo().window(Nxttab);
		Thread.sleep(2000);
        WebElement Email = driver.findElement(By.id("et-info-email"));
		System.out.println("Email ID "+Email.getText());
	}
	

}
