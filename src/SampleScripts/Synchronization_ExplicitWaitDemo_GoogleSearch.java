package SampleScripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWaitDemo_GoogleSearch
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("CitiusTech");
		//Thread.sleep(2000);		
		WebDriverWait wait=new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='btnK']")));	
		WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
		System.out.println(searchButton);
		searchButton.click();
	}
}
