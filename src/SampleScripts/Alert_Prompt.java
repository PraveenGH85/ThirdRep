package SampleScripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Alert_Prompt
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://javascriptkit.com//javatutors//alert2.shtml");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='B4']"));
		ele.click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Hi CitiusTech!");
		Thread.sleep(1000);
		a.accept();
		Thread.sleep(1000);
		a.accept();
		
	}
}