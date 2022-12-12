package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.MyUtility;



public class Mypom3 
{
	@FindBy(xpath = "(//span[text() = '×'])[19]") private WebElement ok;
	@FindBy(xpath = "(//a[text() = 'Close'])[5]")private WebElement close;
	public Mypom3 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void okbutton(WebDriver driver)
	{
		if(ok.isDisplayed())
		{
	    MyUtility.Mywait(driver, 2000);
		ok.click();	
		Reporter.log("POPup is appered",true);
		
		 MyUtility.Mywait(driver, 2000);
		
		close.click();
		
		}
		else
		{
			Reporter.log("POPup not appered",true);
		}
	}
	/*public void closed(WebDriver driver)
	{
		close.click();
	}*/
}
