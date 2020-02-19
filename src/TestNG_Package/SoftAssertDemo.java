package TestNG_Package;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test
	public void softAssert()
	{
		SoftAssert sa=new SoftAssert();		
		System.out.println("SoftAssert Demo Test start");
		sa.assertEquals(12,13,"SoftAssert Demo is a failure");
		System.out.println("SoftAssert Demo Test End");
		sa.assertAll();		
	}
	
	@Test(priority=1)
	public void hardAssert()
	{
		System.out.println("HardAssert Demo Test start");
		Assert.assertEquals("HardAssert Demo is a failure",12,13);	
		System.out.println("HardAssert Demo Test end");
	}	
}
