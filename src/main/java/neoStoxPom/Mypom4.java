package neoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.MyUtility;




public class Mypom4 
{
	
		@FindBy(id = "lbl_username") private WebElement userName;
		//@FindBy(id = "lbl_curbalancetop") private WebElement acBalance;
		@FindBy(xpath = "//span[@id='lbl_curbalancetop']")private WebElement acBalance;
		@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
			
			public Mypom4  (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			public String getActualusername(WebDriver driver)
			{
				MyUtility.Mywait(driver, 1000);
				String txt = userName.getText();
				Reporter.log("getting actual user name",true);
				MyUtility.Mywait(driver, 2000);
			
				Reporter.log("Actual user name is Hi ",  true);
				return txt; 
			}
			
			public String acbalance(WebDriver driver)
			{
				MyUtility.Mywait(driver, 1000);
			  String accBalance = acBalance.getText();
				Reporter.log("getting accBalance ", true);
				Reporter.log("Account Balance is "+accBalance,true);
				return accBalance;
			}
			
			public void logout(WebDriver driver)
			{
				//Utility1.wait(driver, 1000);
				userName.click();
				MyUtility.Mywait(driver, 1000);
				logOutButton.click();
				Reporter.log("Logging out", true);
			}
	
	

	
}
