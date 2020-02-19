package SampleScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownPrintAllOptions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DropDownMultiple.html");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//select"));
		Select s=new Select(e);
		List<WebElement> l = s.getOptions();		
		for(WebElement we:l)
		{
			String optionText=we.getText();
			System.out.println(optionText);
		}
	}
}
