package SampleScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_BestWay 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./DriversAndServer/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D82875260045%26hvpone%3D%26hvptwo%3D%26hvadid%3D398776709897%26hvpos%3D1t1%26hvnetw%3Dg%26hvrand%3D14648558173157638378%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062238%26hvtargid%3Dkwd-895441526047%26hydadcr%3D7878_1982971%26gclid%3DEAIaIQobChMIuvL46KbR5gIVgpKPCh0y3AtmEAAYASAAEgK6yvD_BwE&switch_account=");
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));	
		sendInput(driver,username,2,"8867571101");
		WebElement Kontinue=driver.findElement(By.xpath("//input[@id='continue']"));
		mouseClick(driver,Kontinue,4);
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));	
		sendInput(driver,password,5,"Pra_Kum@85");
		WebElement login=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		mouseClick(driver,login,2);
		WebDriverWait w=new WebDriverWait(driver,0);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Mi A2']")));
		WebElement onida = driver.findElement(By.xpath("//img[@alt='Mi A2']"));		
        System.out.println(onida.getAttribute("src"));		
        mouseClick(driver,onida,5);
        //onida.click();
        System.out.println("End");
	}	
	static void sendInput(WebDriver driver, WebElement element, long timeOut, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	static void mouseClick(WebDriver driver, WebElement element, long timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}	
}
