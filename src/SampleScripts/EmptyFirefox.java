package SampleScripts;
import org.openqa.selenium.firefox.FirefoxDriver;
public class EmptyFirefox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.gecko.driver";
		String value="C:\\Users\\praveenn\\Desktop\\QSpiders\\QSpiders\\Java\\PraveenWorkSpace\\TestSeleniumProject\\DriversAndServer\\geckodriver.exe";
		//String value="./DriversAndServer/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.close();
	}
}
