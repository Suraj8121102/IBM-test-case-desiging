package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description {
	@Test(description = "This is 1st test case")
	public void TC1()
	{
		Reporter.log("TC1 execution", true);
	}

	@Test(description = "This is 2nd test case")
	public void TC2()
	{
		Reporter.log("TC2 execution", true);
	}

	 @Test(description = "This is 3rd test case")
	public void TC3()
	{
		Reporter.log("TC3 execution", true);
	} 
}
