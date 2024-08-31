package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void car() 
	{
		Reporter.log("BMW", true);
	}
}
