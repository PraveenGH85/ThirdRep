package SampleScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Robot_FileUpload_EasyUpload_Chrome 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./DriversAndServer/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://easyupload.io/");
		Thread.sleep(2000);		
		WebElement clickHere=driver.findElement(By.xpath("//form[@class='valign-wrapper']"));
		clickHere.click();
		Robot r=new Robot();
		StringSelection filePath=new StringSelection("C:\\Users\\praveenn\\Desktop\\LeavePlan.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
	    r.setAutoDelay(1000);	    
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);						
		WebElement exp=driver.findElement(By.xpath("//span[@class='filter-option pull-left']"));	
		exp.click();
		Thread.sleep(2000);
		WebElement days_15 = driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li[3]"));
		days_15.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pra_Kum@85");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='upload']"));
		submit.click();	
	}
}
