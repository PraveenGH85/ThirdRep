package SampleScripts;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownDuplicatesA1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DropDown.html");
		WebElement dd = driver.findElement(By.xpath("//select"));
		Select s_dd=new Select(dd);
		List<WebElement> listOfOptions = s_dd.getOptions();
		HashSet HS=new HashSet();
		//Approach 1
		for (WebElement we:listOfOptions)
		{
			String we_text=we.getText();
			HS.add(we_text);
		}
		System.out.println(HS);
		System.out.println("Number of Elements are : "+HS.size());		
	}
}
