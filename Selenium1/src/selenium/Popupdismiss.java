package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupdismiss {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("id=\"confirmBox\"")).click();
Thread.sleep(2000);
driver.switchTo().alert().dismiss();
	}

}
