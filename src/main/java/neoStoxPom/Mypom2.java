package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.MyUtility;



public class Mypom2 
{
	@FindBy(xpath = "//input[@autocomplete='new-password']") private WebElement passcode;
	@FindBy(xpath = "//a[@onclick='return _chkpin();']") private WebElement submit;


	public Mypom2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void pass(WebDriver driver, String pass)
	{
		MyUtility.Mywait(driver, 1000);
		passcode.sendKeys(pass);
		Reporter.log("Entering password", true);

	}

	public void sumbit1(WebDriver driver)
	{ 
		MyUtility.Mywait(driver, 1000);
		submit.click();
		Reporter.log("Clicking on submit Button", true);
	}
	
	
	
}
