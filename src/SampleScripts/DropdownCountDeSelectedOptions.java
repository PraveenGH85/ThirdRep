package SampleScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownCountDeSelectedOptions 
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
		List<WebElement> l_total = s.getOptions();
		int count = l_total.size();
		System.out.println("Total number of available options : "+count);		
		s.selectByIndex(3);
		s.selectByIndex(6);
		s.selectByIndex(9);
		List<WebElement> l_selected = s.getAllSelectedOptions();
		int s_count=l_selected.size();
		System.out.println("Total number of options selected : "+s_count);
		System.out.println("Selected options : ");
		for(int i=0;i<s_count;i++)
		{
			WebElement option=l_selected.get(i);
			String optionText=option.getText();
			System.out.println(optionText);
		}
		int d_count = count - s_count;
		System.out.println("Total number of deselected options : "+d_count);
	}
}
