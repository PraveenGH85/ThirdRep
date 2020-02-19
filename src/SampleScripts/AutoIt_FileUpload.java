package SampleScripts;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class AutoIt_FileUpload 
{
	public static void main(String[] args) throws AWTException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://safenote.co/upload-file");				
		Thread.sleep(5000);
		WebElement addPlus=driver.findElement(By.xpath("//div[@class='dz-message']/i"));
		addPlus.click();	
		Runtime run = Runtime.getRuntime();
		System.out.println(run);
		Runtime.getRuntime().exec("C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\src\\SampleScripts\\AutoIt_FileUpload.exe");
		Thread.sleep(10000);
		WebElement advOptions = driver.findElement(By.id("btn-options"));
		advOptions.click();		
		Thread.sleep(1000);
		WebElement expiry = driver.findElement(By.xpath("//select[@name='lifetime']"));
		Select dd_expiry= new Select(expiry);
		dd_expiry.selectByIndex(0);
		Thread.sleep(1000);
		WebElement views = driver.findElement(By.xpath("//input[@name='count']"));
		views.clear();
		views.sendKeys("4");
		Thread.sleep(1000);
		WebElement mPass = driver.findElement(By.xpath("//input[@name='password']"));
		mPass.sendKeys("Pra_Kum@85");
		Thread.sleep(1000);
		WebElement cPass = driver.findElement(By.xpath("//input[@name='re_password']"));
		cPass.sendKeys("Pra_Kum@85");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("PraveenKumar.Natarajan@citiustech.com");
		Thread.sleep(1000);
		WebElement refName = driver.findElement(By.xpath("//input[@name='reference_name']"));
		refName.sendKeys("Sachin Praveen");
		Thread.sleep(1000);
		WebElement upload = driver.findElement(By.xpath("//button[@id='submit']"));
		upload.click();				
	}
}
