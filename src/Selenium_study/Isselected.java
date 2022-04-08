package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Option1CheckBox =driver.findElement(By.name("checkBoxOption1"));
		//System.out.println(Option1CheckBox.isSelected());
		boolean result = Option1CheckBox.isSelected();
		
		if(result)
		{
		System.out.println("checkBox is already selected");	
		}
		else {
			System.out.println("check box is not selected,Selecting check box now");
			Option1CheckBox.click();
			Thread.sleep(2000);
		boolean result2 = Option1CheckBox.isSelected();
		System.out.println("updated checkbox status is "+result2);
		}
	}

}
