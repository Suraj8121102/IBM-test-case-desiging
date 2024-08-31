package testassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertequals {
@Test
public void test()
{
	String act ="Hello";
	String exp = "Hello";
	
	Assert.assertEquals(act, exp, " Both are equals");
}
}
