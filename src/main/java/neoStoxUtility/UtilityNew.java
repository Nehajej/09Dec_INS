package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew {

	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//Create object of properties class
		Properties prop = new Properties();
		//Create object of fileinputstream & pass the path ofneostox.properties
		FileInputStream filemy = new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\02Dec_Evening\\neoStox.properties");
		
		prop.load(filemy);
	   String value = prop.getProperty(key);
	   //System.out.println(value);
	   
		Reporter.log("Reading"+key+"from property file", true);
		return value;
				
	}
	public static String readexcelsheet(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("D:\\SS\\Mydetails.xlsx");
		String datareading = WorkbookFactory.create(myFile).getSheet("Sheet4").getRow(row).getCell(cell).getStringCellValue();
		
		return datareading;
		
	}
	
		
	
	
	public static void screenshot(WebDriver driver, String screenshotname) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\SS1"+screenshotname+".png");
		FileHandler.copy(src, des);
	}

	public static void scrollingview(WebDriver driver,WebElement element)
	{
		wait(driver, 500);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("SCrolling into view",true);
	}
	
	public static void wait(WebDriver driver, int wait)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wait));
		Reporter.log("waiting for");
	}
	

}
