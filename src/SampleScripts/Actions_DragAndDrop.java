package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(3000);
		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		WebElement b2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement b4 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(b3, b4).perform();
		Thread.sleep(3000);
		act.dragAndDrop(b2, b1).build().perform();
		Thread.sleep(3000);
		act.clickAndHold(b2).moveToElement(b4).release().perform();
		Thread.sleep(3000);
		act.clickAndHold(b1).moveToElement(b4).release().build().perform();
	}
}
