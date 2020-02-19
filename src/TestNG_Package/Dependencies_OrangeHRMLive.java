package TestNG_Package;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependencies_OrangeHRMLive 
{
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("=========Browser Opened=========");
	}	
	
	@Test
	public void startApp()
	{		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("orangehrmlive.com"));
		System.out.println("=========Case 1 : Application OrangeHRMLive started successfully=========");
	}
	
	@Test (dependsOnMethods="startApp")
	public void loginApp()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		boolean status = driver.findElement(By.xpath("//b[.='Admin']")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("=========Case 2 : Application OrangeHRMLive Logged in successfully=========");
	}
	
	@Test (dependsOnMethods={"loginApp","startApp"})
	public void logoutApp() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,30);	
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='welcome']")));
		driver.findElement(By.xpath("//a[@id='welcome']")).click();				
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Logout']")));
		driver.findElement(By.xpath("//a[.='Logout']")).click();	
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='txtUsername']")).isDisplayed());
		Thread.sleep(3000);
		System.out.println("=========Case 3 : Application OrangeHRMLive Logged out successfully=========");
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		System.out.println("\n=========Browser Closed=========\n\n\n\n");
	}

}
