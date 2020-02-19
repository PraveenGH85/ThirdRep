package TestNG_Package;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependencies 
{
	@Test (enabled=true)
	public void compose()
	{
		Reporter.log("Compose",true);
	}
	
	@Test (dependsOnMethods="compose")
	public void sentItems()
	{
		Reporter.log("Sent Items",true);
		Assert.fail();
	}
	
	@Test (dependsOnMethods="sentItems", enabled=false)
	public void trash()
	{
		Reporter.log("Trash",true);		
	}

}
