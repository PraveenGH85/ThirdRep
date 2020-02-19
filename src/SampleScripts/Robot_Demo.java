package SampleScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Robot_Demo 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("http://www.tinyupload.com/");
		Thread.sleep(5000);		
		WebElement browse = driver.findElement(By.xpath("//*[@name='uploaded_file']"));
		browse.click();
		//browse.sendKeys("C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\doubleClick.html");
		//StringSelection filepath=new StringSelection("C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\doubleClick.html");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
	}
}