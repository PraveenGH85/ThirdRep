package SampleScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownCountSelectedOptions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DropDownMultiple.html");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//select"));
		Select s=new Select(e);
		s.selectByIndex(3);
		s.selectByIndex(6);
		s.selectByIndex(9);
		List<WebElement> l = s.getAllSelectedOptions();
		int count=l.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement option=l.get(i);
			String optionText=option.getText();
			System.out.println(optionText);
		}
		
	}
}
