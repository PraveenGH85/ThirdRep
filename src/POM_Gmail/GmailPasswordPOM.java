package POM_Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPasswordPOM 
{
	//Declaration
	@FindBy(xpath="//input[@type='password']")
	private WebElement pw;
	
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	private WebElement pwNext;
	
	//Initialization
	public GmailPasswordPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setPassword(String pwd, WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(pw));
		pw.sendKeys(pwd);
	}	
	
	public void submitPassword(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(pwNext));
		pwNext.click();
	}
}
