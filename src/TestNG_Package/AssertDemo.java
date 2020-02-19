package TestNG_Package;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssertDemo 
{
	@Test
	public void meth1()
	{
		Assert.assertTrue(false);		
	}
	
	@Test
	public void meth2()
	{
		Assert.assertTrue(true);				
	}
	
	@Test
	public void meth3()
	{
		String name="Sachin";
		Assert.assertTrue(name.contains("praveen"));			
	}	
	@Test
	public void meth4()
	{
		String name="Sachin";
		Assert.assertTrue(name.contains("Sachin"));			
	}
	@Test
	public void meth5()
	{
		String name="Sachin";
		Assert.assertTrue("Meth5.......NO MATCH BRO!!!!!!!!!",name.contains("praveen"));			
	}	
	@Test
	public void meth6()
	{
		String name="Sachin";
		Assert.assertTrue("Meth6.......NO MATCH BRO!!!!!!!!!",name.contains("Sachin"));			
	}
	@Test
	public void meth7()
	{
		Assert.assertEquals(12,12);			
	}
	@Test
	public void meth8()
	{
		Assert.assertEquals(12,13);			
	}
	@Test
	public void meth9()
	{
		Assert.assertEquals("Meth9.......NO MATCH BRO!!!!!!!!!",12,12);			
	}
	@Test
	public void meth10()
	{
		Assert.assertEquals("Meth10.......NO MATCH BRO!!!!!!!!!",12,13);			
	}
}
