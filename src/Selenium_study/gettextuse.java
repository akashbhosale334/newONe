package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class gettextuse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")));
		
	 WebElement  dd=driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		//String text = dd.getText();
	    String Actualtext = dd.getText();
	 
//		System.out.println("text is "+text);
		System.out.println("text is "+Actualtext);

		String Expectedtext="Welcome To Practice Page";
		
		if(Actualtext.equals(Expectedtext))
		{
			System.out.println("text is matching,TC is passed");
		}
		else
		{
		System.out.println("text is not matching,TC is failed");	
		}
	}

}
