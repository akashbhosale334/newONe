package serialAndparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialAndparallel1 {
  @Test
  public void Mymethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		  }
}
