package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year")); 

    //day.click();
	Actions act  =new  Actions(driver);
//	Actions act1 =new  Actions(driver);
//	Actions act2 =new  Actions(driver);
	//clicking on day field
    act.click(day).perform();
    for(int i=0;i<=8;i++)
    {
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);

    }
    act.sendKeys(Keys.ENTER).perform();
    for(int i=0;i<=14;i++)
    	
    {
    	act.sendKeys(Keys.ARROW_UP).perform();
    	Thread.sleep(1000);
   }
//    act.sendKeys(Keys.ENTER).perform();
//    act.click(month).perform();
//    for (int i=0; i<=3; i++)
//    {
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//	}
//      act.sendKeys(Keys.ENTER).perform();
//      for(int i=0;i<=25;i++)
//      {
//    	  act.sendKeys(Keys.ARROW_DOWN).perform();
//    	  act.click(month).perform();
//    	  Thread.sleep(2000);
//      }
//      act.sendKeys(Keys.ENTER).perform();
	}

	}
