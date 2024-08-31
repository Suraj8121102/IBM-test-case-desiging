package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParralelB {
	@Test
	public void TC2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	}
}
