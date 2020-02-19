package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername(String username)
	{
		driver.findElement(By.name("username")).sendKeys(username);
	}
	
	public void typePassword(String password)
	{
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
