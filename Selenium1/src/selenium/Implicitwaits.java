package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Implicitwaits {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
Thread.sleep(1000);

// add implicitywait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


try
{
//driver.findElement(By.xpath("//a[@aria-label=\"Gmail \"]")).click();


// wrong inputwaits
driver.findElement(By.xpath("Wrong inputs")).click();
}
catch (Exception e)
{
	
	System.out.println(e);
	
}
	}

}
