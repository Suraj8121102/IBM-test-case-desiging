package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test
	public void TC1()
	{
		Reporter.log("TC1 execution", true);
	}

	@Test(timeOut = 200)
	public void TC2()
	{
		Reporter.log("TC2 execution", true);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 @Test
	public void TC3()
	{
		Reporter.log("TC3 execution", true);
	} 
}
