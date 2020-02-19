package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CssSelector 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.gecko.driver","C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/praveenn/Desktop/CustomPage.html");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[id='dstrain']")).sendKeys("Blue Scorpion");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[value='A500']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[value='B500']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name='dsize']")).sendKeys("2 Inches");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[type='button']")).sendKeys("2 Inches");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("a[href='http://www.samsdiscus.com/stock.html']")).click();		
	}
}
