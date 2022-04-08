package Selenium_study;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//1.
		WebElement multiselectbox = driver.findElement(By.name("cars"));
		//2.
		Select sc =new Select(multiselectbox );
		//3.
		boolean result =sc.isMultiple();
		System.out.println("multiple check is "+result);
		
		sc.selectByIndex(3);
		Thread.sleep(1000);
		sc.selectByValue("opel");
		Thread.sleep(2000);
		sc.selectByVisibleText("Saab");
		
		//deselect
		sc.deselectByVisibleText("Saab");
	}

}
