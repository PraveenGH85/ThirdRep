package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CRMTest 
{
	@Test
	public void loginTest() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/login.cfm");
		
		LoginPage login=new LoginPage(driver);
		login.typeUsername("mailtopraveen85@gmail.com");
		Thread.sleep(2000);
		login.typePassword("Pra_Kum@85");
		Thread.sleep(2000);
		login.clickLoginButton();
	}	
}
