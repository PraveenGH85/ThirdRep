package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class JSEDataToDisabledTextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DisabledTextBox.html");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("document.getElementById('t3').value='xyz'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t3').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t3').value='abc'");
		Thread.sleep(2000);
		js.executeScript("window.history.go(0)");
		String sText =  js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(sText);
		js.executeScript("alert('Javascript Executor alert')");
	}
}
