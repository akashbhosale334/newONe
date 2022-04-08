package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_textuse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//	System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")));
	Thread.sleep(2000);
	
	WebElement dd = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	//String text =dd.getText();
	String Actualtext =dd.getText();
	//System.out.println("text is "+text);
	System.out.println("text is"+Actualtext);
	
	String Expectedtext ="Facebook helps you connect and share with the people in your life.";
    if (Actualtext.equals(Expectedtext))
    {
    	System.out.println("text is matching,tc is passed");
    }
    else {
		System.out.println("text is not matching, tc is failed");
	}
    	Thread.sleep(3000);
    	//username
    	driver.findElement(By.id("email")).sendKeys("akashbhosale38@gmail.com");
    	//password
    	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("78789878");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}