package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handling_multiple_websites {
  @Test
  public void myMethod1()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\selenium java drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
  }
  @Test
  public void myMethod2()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\selenium java drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
  }@Test
  public void myMethod3()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\selenium java drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
  }
}
