package Selenium_study;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//to get size
		
	//	System.out.println(driver.manage().window().getSize());
		
    	Dimension defaultsize=driver.manage().window().getSize();
	   Thread.sleep(2000);
	   System.out.println("output size "+defaultsize);
	    
	    //to setsize create object of dimension class which will accept width and height
	   Dimension dimension =new Dimension(900,500);
	   //this method sesize which will accept object of Dimension class
	   Thread.sleep(2000);
	   driver.manage().window().setSize(dimension);
	   
	   System.out.println(driver.manage().window().getSize());
	}

}
