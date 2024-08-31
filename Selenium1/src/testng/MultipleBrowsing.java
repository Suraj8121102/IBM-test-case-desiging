package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsing {
	
@Parameters("browsername")
@Test
public void TC1(String browsername )
{
	WebDriver driver = null;
	if(browsername.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browsername.equals("Edge"))
	{
		driver = new EdgeDriver();
	}
	driver.get("https://www.redbus.in/");
}

}
