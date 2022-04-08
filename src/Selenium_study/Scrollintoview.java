package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrollintoview {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://vctcpune.com/selenium/practice.html");
driver.manage().window().maximize();
Thread.sleep(2000);
 
WebElement checkboxopt1 = driver.findElement(By.name("checkBoxOption1"));

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();",checkboxopt1);

Thread.sleep(3000);
checkboxopt1.click();
}

}
