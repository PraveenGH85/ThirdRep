package TestNG_Package;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyPageTitle_AssertEquals 
{
	WebDriver driver;
	
	@Test
	public void verifyTitleEquals()
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualTitle=driver.getTitle();
		System.out.println("Title is "+actualTitle);
		String expectedTitle="OrangeHR";
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Test1 Completed");		
	}
	
	@Test
	public void verifyTitleTrue()
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualTitle=driver.getTitle();
		System.out.println("Title is "+actualTitle);
		String expectedTitle="OrangeHR";
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		System.out.println("Test2 Completed");			
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
		System.out.println("Closed");	
	}	
}
