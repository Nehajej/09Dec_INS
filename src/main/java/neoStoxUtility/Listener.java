package neoStoxUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener


{
	
	public void onTestFailure(ITestResult result)
{
	String TcName = result.getName();
Reporter.log("Tc "+TcName+" failed pls try again", true);
}

public void onTestSuccess(ITestResult result)
{
	Reporter.log("Tc Is sucess"+result.getName(), true);
}

public void onTestSkipped(ITestResult result) 
{
	
	Reporter.log("Tc Is sucess"+result.getName(), true);
}



}
