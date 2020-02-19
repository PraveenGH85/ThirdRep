package POM_Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailUsernamePOM 
{
	//Declaration
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement un;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement unNext;
	
	//Initialization
	public GmailUsernamePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUsername(String unText)
	{
		un.sendKeys(unText);
	}	
	
	public void submitUsername()
	{
		unNext.click();
	}	
}
