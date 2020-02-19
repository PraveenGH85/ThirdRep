package POM_Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailEmailPOM 
{
	//Declaration
	@FindBy(xpath="//a[@class='gb_D']")
	private WebElement gAppsButton;
	
	@FindBy(xpath="//span[.='Gmail']")
	private WebElement gmailButton;
	
	@FindBy(xpath="//div[@class='gb_Hf']/a[@class='gb_D']")
	private WebElement userIcon;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signOut;
	
	//Initialization
	public GmailEmailPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void click_gAppsButton(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(gAppsButton));
		gAppsButton.click();
	}	
	
	public void click_gmailButton(WebDriver driver) throws InterruptedException
	{
		//WebDriverWait wait=new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOf(gmailButton));
		Thread.sleep(25000);
		gmailButton.click();
	}	
	public void click_userIcon(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(userIcon));
		userIcon.click();		
	}
	public void click_signOut(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(signOut));
		signOut.click();
	}
}
