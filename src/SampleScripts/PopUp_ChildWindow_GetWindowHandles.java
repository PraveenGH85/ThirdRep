package SampleScripts;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class PopUp_ChildWindow_GetWindowHandles
{
	public static <T> void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/doubleClick.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='dblbutton']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();	
		Thread.sleep(4000);
		Set<String> parentId = driver.getWindowHandles();
		System.out.println(parentId);
		int count=parentId.size();
		System.out.println(count+"\n");
		for(String pid:parentId)
		{
			driver.switchTo().window(pid);
			System.out.println(pid);
			String title=driver.getTitle();
			System.out.println(title);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			System.out.println();			
			Thread.sleep(2000);
		}	
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		for(String wh:parentId)
		{
			String h=wh.toString();
			ts.add(h);
			System.out.println("Adding "+h+" to TreeSet");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("Order of closing : "+ts+"\n");
		for(String pid:ts)
		{	 
			driver.switchTo().window(pid);
			System.out.println("Closing "+driver.getTitle());
			driver.close();
			Thread.sleep(3000);
		}			
	}
}
