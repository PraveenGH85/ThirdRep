package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ConnectCitius 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://adfs.citiustech.com/adfs/ls/");	
		//driver.switchTo().alert().accept();
		driver.findElement(By.id("userNameInput")).sendKeys("PraveenKumar.Natarajan@citiustech.com");
		driver.findElement(By.id("passwordInput")).sendKeys("password_1234");
		driver.findElement(By.id("submitButton")).click();
	}
}
