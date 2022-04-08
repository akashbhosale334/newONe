package Selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
Thread.sleep(4000);

WebElement Clickmebutton = driver.findElement(By.id("confirmButton"));
Clickmebutton.click();
Alert alt = driver.switchTo().alert();//switched selenium focus to new alert popup

 String textonalertpopup = alt.getText();
System.out.println("text on alert popup is "+textonalertpopup);
alt.accept();   // accepting alert clicking on button

Thread.sleep(3000);//not completed previous option so we will accept it first

WebElement Promtbutton = driver.findElement(By.id("promtButton"));
Promtbutton.click();
Alert alt2 = driver.switchTo().alert();//switched selenium focus to new alert popup
String textonalertpopup1 =alt.getText();
System.out.println("text on alert popup is "+textonalertpopup1); 
Thread.sleep(2000);
alt2.dismiss();


WebElement Timeralert = driver.findElement(By.id("timerAlertButton"));
Timeralert.click(); Thread.sleep(8000);
Alert alt3 = driver.switchTo().alert();
String  textontimer=alt.getText();
System.out.println("timer alert text"+textontimer);
Thread.sleep(8000);
alt3.accept();
	}

}
