package SampleScripts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./DriversAndServer/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C256741341326%7Ce%7Cfacebook%7C&placement=&creative=256741341326&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9061998%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAws7uBRAkEiwAMlbZjpp4O9vamQDZx_jxyoiUGD2DejpC75ttCsG5U3xnHoQCz3C1z17KhhoCVq8QAvD_BwE");
		Thread.sleep(3000);
		WebElement we_d = driver.findElement(By.xpath("//select[@id='day']"));
		Select day_dd=new Select(we_d);
		WebElement we_m=driver.findElement(By.xpath("//select[@id='month']"));
		Select month_dd=new Select(we_m);
		WebElement we_y=driver.findElement(By.xpath("//select[@id='year']"));
		Select year_dd=new Select(we_y);
		day_dd.selectByIndex(5);
		Thread.sleep(2000);
		month_dd.selectByValue("12");
		Thread.sleep(2000);
		year_dd.selectByVisibleText("2006");	
		Thread.sleep(2000);
		WebElement e1 = day_dd.getFirstSelectedOption();
		System.out.println("The Selected Day is : "+e1.getText());
		WebElement e2 = month_dd.getFirstSelectedOption();
		System.out.println("The Selected Day is : "+e2.getText());
		WebElement e3 = year_dd.getFirstSelectedOption();
		System.out.println("The Selected Day is : "+e3.getText());
		//System.out.println("The Selected Day is : \n"+we_d.getText());
	    List<WebElement> listOfMonths = month_dd.getOptions();
	    System.out.println(listOfMonths.size());
	    for(WebElement we:listOfMonths)
	    {
	    	String m_name=we.getText();
	    	System.out.println(m_name);
	    }    	    
	}
}
