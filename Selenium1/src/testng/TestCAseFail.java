package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCAseFail {

	@Test
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
	}
	@Test
	public void TC2()
	{
		Assert.fail();
		Reporter.log("TC2 is executed", true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
}
