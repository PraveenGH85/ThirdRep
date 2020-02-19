package SampleScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownMultipleSelectAndDeselectDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DropDownMultiple.html");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//select"));		
		Select s = new Select(e);
		List<WebElement> l = s.getOptions();
		System.out.println(l.size());
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		boolean b=s.isMultiple();
		System.out.println(b);
		if(b)
		{
			s.deselectAll();
			System.out.println("Multi-Select Dropdown");
		}
		else
		{			
			System.out.println("Single-Select Dropdown");
		}	
	}
}
