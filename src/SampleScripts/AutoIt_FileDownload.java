package SampleScripts;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AutoIt_FileDownload 
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/downloads/");
		WebElement ele = driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[3]/a[1]"));
		ele.click();		
		Runtime run = Runtime.getRuntime();
		System.out.println(run);
		Runtime.getRuntime().exec("C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\src\\SampleScripts\\AutoIt_FileDownload.exe");		
	}
}
