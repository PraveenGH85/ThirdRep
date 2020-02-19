package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class JSENavigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		RemoteWebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("document.getElementById('enterimg').click()");
		Thread.sleep(8000);
		js.executeScript("window.history.back()");
		Thread.sleep(4000);
		js.executeScript("window.history.forward()");
		Thread.sleep(8000);
		js.executeScript("window.history.go(-1)");
		Thread.sleep(4000);
		js.executeScript("window.history.go(1)");
	}
}
