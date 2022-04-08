package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_use {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();


//driver.get("https://kite.zerodha.com/");
//driver.manage().window().maximize();
//Thread.sleep(2000);
//
//
//driver.findElement(By.xpath("//input[@id='userid']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ak47");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@id='password']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ak47");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.get("https://vctcpune.com/selenium/practice.html");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//h1[contains(@class,' header1 font-weight-bold text-white text-center')]"));
//Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();






























  
Thread.sleep(3000);
driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 _4jy6 _4jy')]"));

}

}
