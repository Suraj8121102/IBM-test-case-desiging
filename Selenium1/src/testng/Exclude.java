package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exclude {
@Test
public void TC1() 
{
	Reporter.log("India", true);
}
@Test
public void TC2() 
{
	Reporter.log("Maharashtra", true);
}
@Test
public void TC3() 
{
	Reporter.log("pune", true);
}
}
