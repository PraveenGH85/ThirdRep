package POM_Gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSentItemsPOM 
{
	//Declaration
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;	
	
	
	//Initialization
	public GmailSentItemsPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization		
	public void countNoOfLinks(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a")));
		int count=allLinks.size();		
		for(WebElement link:allLinks)
		{
			String linkText=link.getText();
			System.out.println(linkText);
		}	
		System.out.println(count);
	}
}
