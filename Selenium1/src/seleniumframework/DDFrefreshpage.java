package seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDFrefreshpage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

WebElement abc = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));

//driver.navigate().refresh();
//Thread.sleep(2000);
abc.sendKeys("standard_user");

	}

}
