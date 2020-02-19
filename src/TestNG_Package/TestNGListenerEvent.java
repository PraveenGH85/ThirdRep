package TestNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNG_Package.TestNGListener.class)
public class TestNGListenerEvent 
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 sysout");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("Test2 sysout");
		Assert.fail();
	}
}
