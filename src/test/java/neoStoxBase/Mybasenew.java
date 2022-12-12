package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.MyUtility;


public class Mybasenew 
{
	protected WebDriver driver;
	public void Mylaunchbrowser1() throws InterruptedException, IOException
	{
		   System.setProperty("webdriver.chrome.driver", "E:\\_Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver = new ChromeDriver();
		    driver.get(MyUtility.MyreadDataFromPropertyFile("url"));
		    driver.manage().window().maximize();
		    
		    Reporter.log("launching the browser");
		    Thread.sleep(2000);
		
	}

}
