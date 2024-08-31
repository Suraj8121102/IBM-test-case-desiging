package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,2000);");	
	}

}
