package SampleScripts;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownDuplicatesA2 
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
		LinkedList LL=new LinkedList();
		//Approach 2
		for (WebElement we:listOfOptions)
		{
			String we_text=we.getText();
			LL.add(we_text);
		}
		System.out.println("\nLinkedList Elements : "+LL);
		System.out.println("\nNumber of Elements in Linked List are : "+LL.size());	
		HashSet HS=new HashSet();
		HS.addAll(LL);
		System.out.println("\nHashSet Elements : "+HS);
		System.out.println("\nNumber of Elements in HashSet are : "+HS.size());
	}
}
