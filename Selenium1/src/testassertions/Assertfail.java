package testassertions;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertfail {
	@Test
	public void TC1() 
	{
		fail();
		Reporter.log("India", true);
	}
	@Test
	public void TC2() 
	{
		Reporter.log("Maharashtra", true);
	}
}
