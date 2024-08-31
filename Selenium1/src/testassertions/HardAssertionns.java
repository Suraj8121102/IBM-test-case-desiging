package testassertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertionns {
@Test
public void Hardassert()
{
	Reporter.log("Ajinkya", true);
	Assert.assertTrue(true);
	
	Reporter.log("Aj", true);
	Assert.assertTrue(false);
	
	Reporter.log("An", true);
	Assert.assertTrue(true);
}
@Test
public void soft()
{
	Reporter.log("suraj", true);
	
	
	
}
}
