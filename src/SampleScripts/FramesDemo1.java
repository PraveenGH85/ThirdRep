package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class FramesDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/page1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("TextBox1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("TextBox2");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys("TextBox3");
		Thread.sleep(2000);
		driver.findElement(By.id("t3")).clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).clear();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys("TextBox3");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("TextBox1");
	}
}
