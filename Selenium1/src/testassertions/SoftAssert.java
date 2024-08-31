package testassertions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
@Test
public void soft()
{
SoftAssert obj = new SoftAssert();

System.out.print("suraj");
obj.assertTrue(true);

System.out.print("sagar");
obj.assertTrue(false);

System.out.print("sneha");
obj.assertTrue(true);

obj.notifyAll();
}

private void assertTrue(boolean b) {
	// TODO Auto-generated method stub
	
}
}
