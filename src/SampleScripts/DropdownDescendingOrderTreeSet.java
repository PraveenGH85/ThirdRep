package SampleScripts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownDescendingOrderTreeSet 
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
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		System.out.println("Actual Order of the Dropdown :");
		for (WebElement we:l)
		{
			String t=we.getText();
			ts.add(t);
			System.out.println(t);
		}
		System.out.println("\n\nDescending Order of the Dropdown :");
		for(String t:ts)
		{
			System.out.println(t);
		}
	}
}
