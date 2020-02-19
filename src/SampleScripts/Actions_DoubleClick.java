package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_DoubleClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/doubleClick.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='dblbutton']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();			
	}
}
