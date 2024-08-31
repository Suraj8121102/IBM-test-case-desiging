package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupwiseannotations {
@Test(groups = "software company")
public void Infosys()
{
	Reporter.log("Infosys", true);
}
@Test(groups = "software company")
public void Wipro()
{
	Reporter.log("Wipro", true);
}
@Test(groups = "Automobile Company")
public void posco()
{
	Reporter.log("posco", true);
}
@Test(groups = "Automobile Company")
public void magna()
{
	Reporter.log("magna", true);
}
}
