package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled = false)
	public void TC1()
	{
		Reporter.log("TC1 execution", true);
	}

	@Test
	public void TC2()
	{
		Reporter.log("TC2 execution", true);
	}

	 @Test
	public void TC3()
	{
		Reporter.log("TC3 execution", true);
	} 
}
