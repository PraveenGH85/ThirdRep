package POM_Gmail;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Gmail_TestScript 
{
	@Test
	public void login_Logout() throws InterruptedException
	{		
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println(driver);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		GmailUsernamePOM unPOM=new GmailUsernamePOM(driver);
		unPOM.setUsername("mailtopraveen85@gmail.com");		
		unPOM.submitUsername();
		GmailPasswordPOM pwPOM=new GmailPasswordPOM(driver);
		pwPOM.setPassword("torryharris1",driver);
		pwPOM.submitPassword(driver);		
		GmailEmailPOM emailPOM=new GmailEmailPOM(driver);
		emailPOM.click_gAppsButton(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		emailPOM.click_gmailButton(driver);
		/*Set<String> whSet = driver.getWindowHandles();
		for (String wh:whSet)
		{
			driver.switchTo().window(wh);
		}
		Thread.sleep(4000);
		emailPOM.click_userIcon(driver);
		Thread.sleep(3000);
		emailPOM.click_signOut(driver);*/
		Thread.sleep(2000);
		driver.quit();
	}	
	
	@Test(enabled=false)
	public void sendEmail() throws InterruptedException
	{		
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println(driver);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		GmailUsernamePOM unPOM=new GmailUsernamePOM(driver);
		unPOM.setUsername("mailtopraveen85@gmail.com");		
		unPOM.submitUsername();
		
		GmailPasswordPOM pwPOM=new GmailPasswordPOM(driver);
		pwPOM.setPassword("torryharris1",driver);
		pwPOM.submitPassword(driver);	
		
		GmailEmailPOM emailPOM=new GmailEmailPOM(driver);
		emailPOM.click_gAppsButton(driver);
		Thread.sleep(2000);
		emailPOM.click_gmailButton(driver);
		
		Thread.sleep(3000);
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
		}
		Thread.sleep(2000);
		GmailEmailHomePOM emailHomePOM=new GmailEmailHomePOM(driver);
		
		emailHomePOM.clickCompose(driver);
		emailHomePOM.enterMailIds(driver, "mailtopraveen85@gmail.com");
		emailHomePOM.enterSubject(driver, "Test Mail");
		emailHomePOM.enterMailBody(driver, "This is a Test mail sent by Selenium");
		emailHomePOM.clickSendMail(driver);

		Thread.sleep(4000);
		emailPOM.click_userIcon(driver);
		Thread.sleep(3000);
		emailPOM.click_signOut(driver);
		Thread.sleep(2000);
		driver.quit();
	}	
	
	@Test(enabled=false)
	public void countSentItemsLinks() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println(driver);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		GmailUsernamePOM unPOM=new GmailUsernamePOM(driver);
		unPOM.setUsername("mailtopraveen85@gmail.com");
		unPOM.submitUsername();
		
		GmailPasswordPOM pwPOM=new GmailPasswordPOM(driver);
		pwPOM.setPassword("torryharris1", driver);
		pwPOM.submitPassword(driver);
		
		GmailEmailPOM emailPOM=new GmailEmailPOM(driver);
		emailPOM.click_gAppsButton(driver);
		Thread.sleep(2000);
		emailPOM.click_gmailButton(driver);
		Thread.sleep(2000);
		
		Set<String> whSet = driver.getWindowHandles();
		for(String wh:whSet)
		{
			driver.switchTo().window(wh);
		}
		Thread.sleep(2000);
		GmailEmailHomePOM emailHomePOM=new GmailEmailHomePOM(driver);
		emailHomePOM.clickSentItems(driver);
		Thread.sleep(2000);
		GmailSentItemsPOM sentItemsLinks=new GmailSentItemsPOM(driver);
		sentItemsLinks.countNoOfLinks(driver);
		Thread.sleep(4000);
		emailPOM.click_userIcon(driver);
		Thread.sleep(3000);
		emailPOM.click_signOut(driver);
		Thread.sleep(2000);
		driver.quit();
	}
	
}
