package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class FramesDemo2 
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
		WebElement fr1=driver.findElement(By.id("f1"));
		driver.switchTo().frame(fr1);
		driver.findElement(By.id("t2")).sendKeys("TextBox2");
		Thread.sleep(2000);		
		WebElement fr2=driver.findElement(By.id("f2"));
		driver.switchTo().frame(fr2);
		driver.findElement(By.id("t3")).sendKeys("TextBox3");
		int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		String handle=driver.getWindowHandle();
		System.out.println(handle);
	}
}
