package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.TextBoxSnapshot;

public class Isdisplayed {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	boolean	result = TextBox.isDisplayed();
	Thread.sleep(2000);
	System.out.println("test box state is "+result);
	
	WebElement Hidebutton = driver.findElement(By.id("hide-textbox"));
	Hidebutton.click();
	boolean result1=TextBox.isDisplayed();
	System.out.println("text box state is "+result1);
	
	
	}

}
   