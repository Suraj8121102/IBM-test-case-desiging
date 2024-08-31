package testassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertnotEquals {
	@Test
	public void test()
	{
		String act ="Hello";
		String exp = "Hey";
		
		Assert.assertNotEquals(act, exp, " Both are not equals");
	}
}
