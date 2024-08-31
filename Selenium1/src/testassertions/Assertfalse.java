package testassertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {
	@Test
	public void TC()
	{
		boolean b = true ;
		Assert.assertFalse(b);
	}
}
