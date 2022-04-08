package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;

public class My1stSeleniumCode {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
// driver.get("https://apps.google.com/meet/  ");//to enter url in browser to open an application
//Thread.sleep(3000);
//driver.close();//to close the current tab of the browser opened by selenium
//driver.quit();//to close multiple tabs
//driver.manage().window().maximize();
//Thread.sleep(1000);
//driver.get("https://www.eaton.com/us/en-us.html");
//Thread.sleep(1000);
//driver.manage().window().maximize();
//Thread.sleep(1000);
//driver.manage().window().minimize();
//driver.navigate().back();
//Thread.sleep(1000);
//driver.navigate().forward();
//driver.navigate().refresh();
driver.get("https://vctcpune.com/velocity-foundation/");
System.out.println(driver.getTitle());
//String title =driver.getTi  tle();
//System.out.println("Title of  velcocity is" +title);
System.out.println(driver.getCurrentUrl());
//String url=driver.getCurrentUrl();
//System.out.println("url of velocity foundation is "+url);	}
	}
}
