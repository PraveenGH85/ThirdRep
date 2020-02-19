package TestNG_Package;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGScript 
{
	@Test(priority=5, description="Hi, This is Method1", invocationCount=-1)
	public void method1()
	{
		Reporter.log("1M",true);
	}
	
	@Test(priority=-2, description="Hi, This is Method2", invocationCount=0)
	public void method2()
	{
		Reporter.log("2M",true);
		//Assert.fail();
	}
	@Test(priority=3, description="Hi, This is Method3", invocationCount=3)
	public void method3()
	{
		Reporter.log("3M",true);		
	}
	
	@Test(priority=-5, description="Hi, This is Method4", enabled=false)
	public void method4()
	{
		Reporter.log("4M",true);
	}
	
	@Test(priority=-4, description="Hi, This is Method5", enabled=true)
	public void method5()
	{
		Reporter.log("5M",true);
	}
}
