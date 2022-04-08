package KiteappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class KIteloginpage {

	
	
	//1.varaiable declaration ---->webelement
		
		@FindBy(id="userid")private WebElement UserId;
		@FindBy(id="password")private WebElement Password;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
@FindBy(xpath = "//span[contains(text(),'User ID should be ')]")private WebElement UserIDErrorMsg;
@FindBy(xpath = "//span[contains(text(),'Password should be')]")private WebElement passwordErrorMsg;

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
	public String getUserIDErrorMsg()
	{
		String errorMsg = UserIDErrorMsg.getText();
		return errorMsg;
	}
public String getpasswordStringerrormsg()
{
	String errormsg = passwordErrorMsg.getText();
	return errormsg;
	}
}