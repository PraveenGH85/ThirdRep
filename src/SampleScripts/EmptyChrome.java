package SampleScripts;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmptyChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		//String value="C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\DriversAndServer\\geckodriver.exe";
		String value="./DriversAndServer/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}
}
