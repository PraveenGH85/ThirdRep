package SampleScripts;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class Synchronization_FluentWaitDemo_Mukesh 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");	
		driver.findElement(By.xpath("//button[.='Click me to start timer']")).click();	
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);
		WebElement element=wait.until(new Function<WebDriver,WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
				WebElement ele = driver.findElement(By.xpath("//*[@id='demo']"));
				String text = ele.getText();
				if(text.equalsIgnoreCase("WebDriver"))
				{
					return ele;
				}
				else
				{
					System.out.println(text);
					return null;
				}
			}
		});	
		System.out.println("Element is displayed : "+element.isDisplayed());
	}	
}
