package KitepomtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageKitepage {
	//1.
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;

	//2.

	public HomePageKitepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	//3.
	public String getactualUserid()
	{
		  String actualUserid = userId.getText();
		  return actualUserid;
		  //we will verify using testNg asserts not uisng if_else methods
//		  if(actualUserid.equals(expectedUserid))
//		  {
//			  System.out.println("Testcase passed");
//		  }
//		  else 
//		  {
//			  
//				  System.out.println("testcase is failed");
//		  }
	  }	  
	
	public void logout() throws InterruptedException 
	{
		userId.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
}

