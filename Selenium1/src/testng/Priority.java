package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=0)
public void TC1()
{
	Reporter.log("TC1 execution", true);
}

@Test(priority=1)
public void TC2()
{
	Reporter.log("TC2 execution", true);
}

 @Test(priority=2)
public void TC3()
{
	Reporter.log("TC3 execution", true);
} 

}
