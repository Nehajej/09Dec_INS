package neoStoxtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Mybasenew;
import neoStoxPom.Mypom1;
import neoStoxPom.Mypom2;
import neoStoxPom.Mypom3;
import neoStoxPom.Mypom4;
import neoStoxUtility.MyUtility;
import neoStoxUtility.UtilityNew;


@Listeners(neoStoxUtility.Listener.class)

public class MytestNgOutput2UsingListerner extends Mybasenew {
	
	 Mypom1  mylog;
	 Mypom2  mylog2;
	 Mypom3  mylog3;
	 Mypom4  mylog4;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException, IOException
	{
		Mylaunchbrowser1();
		
		mylog = new  Mypom1(driver);
		mylog2 = new Mypom2 (driver);
		mylog3 = new Mypom3 (driver);
		mylog4 = new Mypom4(driver);
		
		
		
	}
	@BeforeMethod
	public void myLogin() throws EncryptedDocumentException, InterruptedException, IOException
	{
		
		//UtilityNew.wait(driver, 1000);
		mylog.mob(driver, UtilityNew.readDataFromPropertyFile("mobnum"));
		mylog.signin(driver);
		
		Reporter.log("Enter mobile number",true );
		Thread.sleep(1000);
		
		mylog2.pass(driver, UtilityNew.readDataFromPropertyFile("passcode"));Thread.sleep(2000);
		mylog2.sumbit1(driver);
		
		Thread.sleep(1000);
		Reporter.log("Enter passcode number",true );
		
		mylog3.okbutton(driver);
		//mylog3.closed(driver);
		Reporter.log("clicking on popup",true );Thread.sleep(2000);
	
		
	}
	@Test
  public void validateUsername() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Thread.sleep(4000);
		Assert.assertEquals(mylog4.getActualusername(driver), UtilityNew.readDataFromPropertyFile("username"));
		Reporter.log("TC is passed",true );
   }
	
	/*@Test(priority = -1)
	public void accountbalance() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		MyUtility.Mywait(driver, 5000);
		Assert.assertNotNull(mylog4.acbalance(driver), "Tc failed actual & expexted not matched");
		Reporter.log("AC is not null Tc is passed",true );
   }*/
	
	@AfterMethod
	public void log()
	{
		mylog4.logout(driver);
	}
	@AfterClass
	public void Browserclose()
	{
		driver.close();
	}
	
	
	
	
	
}
