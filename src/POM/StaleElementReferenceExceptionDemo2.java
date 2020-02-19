package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementReferenceExceptionDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("mailtopraveen85@gmail.com");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Pra_Kum@85");
		Thread.sleep(2000);
		driver.navigate().refresh();
		password.sendKeys("Pra_Kum@85");
		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
