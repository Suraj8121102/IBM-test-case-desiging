package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParralelC {
	@Test
	public void TC3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
	}
}
