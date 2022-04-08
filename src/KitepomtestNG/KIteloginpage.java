package KitepomtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KIteloginpage {

	
	
	//1.varaiable declaration ---->webelement
		
		@FindBy(id="userid")private WebElement UserId;
		@FindBy(id="password")private WebElement Password;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;

	    //int a; a=variable type= int
	    //webdriver= driver;driver=variable type=webdriver

	//2.use constructor---->public

	public KIteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	//3.
	public void Enteruserid(String UId)
	{
		UserId.sendKeys(UId);
	}
	public void eneterpassword(String pwd) 
	{
		Password.sendKeys(pwd);
	}
	public void clickonloginButton() 
	{
		loginButton.click();
	}
}
