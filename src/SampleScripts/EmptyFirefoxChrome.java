package SampleScripts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class EmptyFirefoxChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key1="webdriver.chrome.driver";		
		String value1="./DriversAndServer/chromedriver.exe";
		System.setProperty(key1,value1);
		ChromeDriver driver1=new ChromeDriver();
		Thread.sleep(3000);
		driver1.close();
		String key2="webdriver.gecko.driver";		
		String value2="./DriversAndServer/geckodriver.exe";
		System.setProperty(key2,value2);
		FirefoxDriver driver2=new FirefoxDriver();
		Thread.sleep(3000);
		driver2.close();
	}
}
