package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class zrodha_framework {//without DDF 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement userid = driver.findElement(By.id("userid"));
		    WebElement Password = driver.findElement(By.id("password"));
		    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
		    
		    userid.sendKeys("DAA677");
		    Password.sendKeys("Velocity@123");
		    loginButton.click();
			Thread.sleep(1000);
			
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys("866918");
			continueButton.click();
			
			Thread.sleep(1000);
			WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
			String actualUserID = userID.getText();
			String expectedUserID = "DAA677";
			 

			if(actualUserID.equals(expectedUserID))
			{
				System.out.println("User ID  matching TC passed");
			}
			else {
				System.out.println("User ID not matching TC failed");
			}
			
			userID.click();
			WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
			logOutButton.click();
			driver.close();
			

	}

}
