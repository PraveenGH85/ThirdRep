package SampleScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Youtube_AvengersLikesAndDisLikes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/praveenn/Desktop/QSpiders/QSpiders/Java/PraveenWorkSpace/TestSeleniumProject/DriversAndServer/geckodriver.exe");
		
		//Step 1:
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//Step 2:
		driver.findElement(By.name("q")).sendKeys("youtube login");
		Thread.sleep(25000);
		
	    //Step 3:
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		//Step 4:
		driver.findElement(By.xpath("//span[.='Account - YouTube']")).click();
		Thread.sleep(5000);
		
		//Step 5:
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mailtopraveen85@gmail.com");
		
		//Step 6:
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		
		//Step 7:
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("torryharris1");		
		
		//Step 8:
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(5000);
		
		//Step 9:
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("The Avengers");
		Thread.sleep(2000);
		
		//Step 10:
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		//Step 11:
		driver.findElement(By.xpath("//a[contains(.,'Always Angry')]")).click();
		Thread.sleep(2000);
				
		//Step 12:
		WebElement likes=driver.findElement(By.xpath("(//ytd-video-primary-info-renderer/div[@id='container']/div[1]//div[@id='top-level-buttons']//yt-formatted-string[@class='style-scope ytd-toggle-button-renderer style-text'])[1]"));
		String noOfLikes=likes.getText();
		
		//Step 13:
		WebElement disLikes=driver.findElement(By.xpath("(//ytd-video-primary-info-renderer/div[@id='container']/div[1]//div[@id='top-level-buttons']//yt-formatted-string[@class='style-scope ytd-toggle-button-renderer style-text'])[2]"));
		String noOfDisLikes=disLikes.getText();
		
		//Step 14:
		String title=driver.getTitle();
		System.out.println("\n\nThe video clip played is : "+title);
		System.out.println("\n\nThe Total number of Likes are    : "+noOfLikes);	
		System.out.println("\n\nThe Total number of DisLikes are : "+noOfDisLikes);
	}
}
