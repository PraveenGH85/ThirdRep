package POM_Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailEmailHomePOM 
{
	//Declaration
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@id=':r7']")
	private WebElement to;
	
	@FindBy(xpath="//input[@id=':qp']")
	private WebElement subject;
	
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement messageBody;
	
	@FindBy(xpath="//div[@id=':qf']")
	private WebElement send;
	
	@FindBy(xpath="//a[.='Sent']")
	private WebElement sentItems;	
	
	
	//Initialization
	public GmailEmailHomePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickCompose(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(compose));		
		compose.click();
	}	
	
	public void enterMailIds(WebDriver driver,String mailId)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(to));
		to.sendKeys(mailId);
	}
	
	public void enterSubject(WebDriver driver,String sub)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(subject));
		subject.sendKeys(sub);
	}
	
	public void enterMailBody(WebDriver driver,String mBody)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(messageBody));
		messageBody.sendKeys(mBody);
	}
	
	public void clickSendMail(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(send));
		send.click();
	}
	
	public void clickSentItems(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(sentItems));
		sentItems.click();
	}
}
