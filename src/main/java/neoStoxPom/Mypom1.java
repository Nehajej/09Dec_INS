package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxUtility.MyUtility;
import neoStoxUtility.UtilityNew;

import org.testng.Reporter;


public class Mypom1 
{
	@FindBy(name = "ctl00$MainContent$signinsignup$txt_mobilenumber") private WebElement mobno;
	@FindBy(xpath = "//a[@id='lnk_signup1']")private WebElement signinbutton;

	   public Mypom1  (WebDriver driver)
	   {
		PageFactory.initElements(driver, this);
	   }

	   public void mob(WebDriver driver, String mobNum) throws InterruptedException
		 {
			 UtilityNew.wait(driver, 1000);
			  mobno.sendKeys(mobNum);
			  Thread.sleep(2000);
			  Reporter.log("Entering mobileNumber",true);

			 
		 }
		public void signin(WebDriver driver)
		{
			 MyUtility.Mywait(driver, 1000);
			signinbutton.click();
			Reporter.log("Clicking on SignIN Button",true);
		}

}
