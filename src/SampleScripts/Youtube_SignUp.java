package SampleScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_SignUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/accounts.google.com/signup/v2/webcreateaccount?service=youtube&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3D%252Fpremium&hl=en&dsh=S-1861717425%3A1572879904550998&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp&nogm=true");
		String title=driver.getTitle();
		System.out.println(title);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String SRC=driver.getPageSource();
		System.out.println(SRC);
		WebElement ele1=driver.findElement(By.id("firstName"));
		ele1.sendKeys("Praveen");
		Thread.sleep(1000);
		WebElement ele2=driver.findElement(By.id("lastName"));
		ele2.sendKeys("Kumar");
		Thread.sleep(1000);
		WebElement ele3=driver.findElement(By.id("username"));
		ele3.sendKeys("Praveeen.Kumaar.1985@gmail.com");
		Thread.sleep(1000);
		WebElement ele4=driver.findElement(By.cssSelector("input[aria-label='Password']"));
		ele4.sendKeys("Pra_Kum@85");
		Thread.sleep(1000);
		WebElement ele5=driver.findElement(By.cssSelector("input[aria-label='Confirm']"));
		ele5.sendKeys("Pra_Kum@85");
		Thread.sleep(1000);
		WebElement ele6=driver.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		ele6.click();
	}
}
