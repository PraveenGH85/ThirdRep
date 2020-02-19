package SampleScripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class PopUp_HiddenDivision
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		WebElement calender = driver.findElement(By.xpath("//input[@id='DepartDate']"));
		calender.click();
		Thread.sleep(2000);	
		WebElement date = driver.findElement(By.xpath("//a[.='17']"));
		date.click();
	}
}
