package SampleScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Robot_FileDownloadCancel 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/downloads/");
		WebElement ele = driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[3]/a[1]"));
		ele.click();
		Robot r=new Robot();		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		for(int i=1;i<=4;i++)
		{	
			r.setAutoDelay(1000);
		 	r.keyPress(KeyEvent.VK_TAB);
		 	r.keyRelease(KeyEvent.VK_TAB);			 	
		}
		r.setAutoDelay(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
