package SampleScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWaitDemo_Krishna 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Loader.html");	
		driver.findElement(By.xpath("//button[@id='loader']")).click();	
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Lorem ipsum')]")));
		WebElement modalPopup = driver.findElement(By.xpath("//p[contains(.,'Lorem ipsum')]"));	
		System.out.println(modalPopup);		
		String modalText = modalPopup.getText();
		System.out.println(modalText);
	}	
}
