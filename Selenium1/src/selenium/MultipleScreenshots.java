package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class MultipleScreenshots {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);

String random = RandomString.make(5);

TakesScreenshot s = (TakesScreenshot) driver;
File src = s.getScreenshotAs(OutputType.FILE);
Thread.sleep(1000);

 File dest = new File ("E:\\Automation- java-Videos\\"+random+".png");
 Thread.sleep(2000);
 
 Files.copy(src, dest);
	}

}
