package TestNG_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Cases Started and the details are : "+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Cases Passed and the details are : "+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{		
		System.out.println("Test Cases Failed and the details are : "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Cases Skipped and the details are : "+result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
