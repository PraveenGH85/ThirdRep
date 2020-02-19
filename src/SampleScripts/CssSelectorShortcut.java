package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CssSelectorShortcut 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.gecko.driver","C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/praveenn/Desktop/CustomPage.html");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#dstrain")).sendKeys("Mandarins");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#rb2")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#rb1")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='dsize']")).sendKeys("2 Inches");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[type='button']")).sendKeys("2 Inches");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("a.linkclass")).click();		
	}
}
