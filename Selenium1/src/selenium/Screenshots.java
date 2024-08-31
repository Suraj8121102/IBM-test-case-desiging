package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.manage().window().maximize();

TakesScreenshot s = (TakesScreenshot)driver;

File src=s.getScreenshotAs(OutputType.FILE);
Thread.sleep(1000);

File dest = new File ("E:\\Automation- java-Videos\\sk.png");
Thread.sleep(1000);

Files.copy(src, dest);

}

}
