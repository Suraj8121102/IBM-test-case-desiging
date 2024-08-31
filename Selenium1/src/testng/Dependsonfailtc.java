package testng;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Dependsonfailtc {
	public class Dependsonmethod {
		@Test(dependsOnMethods = {"TestCase2"})
		public void TestCase1()
		{
			Reporter.log("Mobile Login test case", true);
		}
		@Test
		public void TestCase2()
		{assertTrue(false);
			Reporter.log("Web Login test case", true);
		}
		@Test
		public void TestCase3()
		{
			Reporter.log("PC Login test case", true);
		}
}
}
