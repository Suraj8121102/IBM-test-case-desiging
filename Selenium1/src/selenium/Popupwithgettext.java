package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwithgettext {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
Thread.sleep(2000);

driver.switchTo().alert().sendKeys("Suraj");
Thread.sleep(2000);
driver.switchTo().alert().accept();
Thread.sleep(2000);


// String str = driver.switchTo().alert().getText();
//System.out.println(str);

	}

}
