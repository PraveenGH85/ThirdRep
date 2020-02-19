package SampleScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWaitDemo_Mukesh 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");	
		driver.findElement(By.xpath("//button[.='Click me to start timer']")).click();	
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));
		WebElement element = driver.findElement(By.xpath("//p[.='WebDriver']"));	
		boolean status=element.isDisplayed();
		if(status)
		{
			System.out.println(element.getText());
		}
		else
		{
			System.out.println("Element not displayed");
		}
	}	
}
