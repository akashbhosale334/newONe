package KitepomtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpagekite2 {

	
	//1.declaration
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

	//2.
	public Pinpagekite2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		}
	//3.
	public void enterpin(String Pin1)
	{
		pin.sendKeys(Pin1);
	}
	public void clickoncontinuebutton()
	{
		continueButton.click();
	}
}
