package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	
@Test(invocationCount = 5)

public void TC1()
{
	Reporter.log("Multiple execution Test Case", true);
}

}
