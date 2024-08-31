package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestNG2 {

	@Test
	
	public void TC1 ()
	{
		Reporter.log("Running from TC1", true);
	}
	
	@Test
	public void TC2 ()
	{
		//Assert.fail();
		Reporter.log("Running from TC", true);
	}
	
}
