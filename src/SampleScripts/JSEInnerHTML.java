package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class JSEInnerHTML 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/prop_html_innerhtml.asp");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		String valueText=(String) js.executeScript("return document.getElementById('topnavbtn_references').innerHTML");	
		System.out.println(valueText);
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		for (int i=1;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		for (int i=1;i<=3;i++)
		{
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
