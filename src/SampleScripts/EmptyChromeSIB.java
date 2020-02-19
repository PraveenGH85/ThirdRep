package SampleScripts;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmptyChromeSIB 
{
	static
	{
		String key="webdriver.chrome.driver";		
		String value="./DriversAndServer/chromedriver.exe";
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/g-fact-79/");
		Thread.sleep(3000);
		driver.close();
	}
}
