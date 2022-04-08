package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxtest {
  @Test
  public void Mymethod() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\selenium java drivers\\geckodriver.exe");
	  WebDriver driver =new FirefoxDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
  }
}
