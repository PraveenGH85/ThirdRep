package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DiscusPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/praveenn/Desktop/CustomPage.html");
		Thread.sleep(1000);
		driver.findElement(By.id("dstrain")).sendKeys("Albino");
		Thread.sleep(1000);
		driver.findElement(By.id("rb1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("rb2")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("dsize")).sendKeys("3 inches");
		Thread.sleep(1000);
		driver.findElement(By.className("submitclass")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Click here for stock detail")).click();
	}
}
