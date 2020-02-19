package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[.='Technology ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		WebElement gitEle = driver.findElement(By.xpath("//a[@href='https://www.hongkiat.com/blog/github-audio/']"));		
		gitEle.click();
	}
}
