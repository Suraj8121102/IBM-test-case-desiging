package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod {
@Test(dependsOnMethods = {"TestCase2"})
public void TestCase1()
{
	Reporter.log("Mobile Login test case", true);
}
@Test
public void TestCase2()
{
	Reporter.log("Web Login test case", true);
}
@Test
public void TestCase3()
{
	Reporter.log("PC Login test case", true);
}
}
