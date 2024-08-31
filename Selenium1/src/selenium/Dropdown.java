package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login.php/");
driver.manage().window().maximize();
Thread.sleep(1000);

// click on signup for facebook
driver.findElement(By.xpath("//a[@href=\"/r.php?locale=en_GB&display=page\"]")).click();

// select list box
WebElement month = driver.findElement(By.xpath("// select[@id=\"month\"]"));
Thread.sleep(1000);

// create object of action class
 Actions act = new Actions(driver);
 Thread.sleep(1000);
 
 // click on month
 act.click(month).perform();
 
 // move one step upword
 act.sendKeys(Keys.ARROW_UP).perform();
 Thread.sleep(1000);
 
 act.sendKeys(Keys.ARROW_UP).perform();
 Thread.sleep(1000);
 
 // move one step downword
 act.sendKeys(Keys.ARROW_DOWN).perform();
 Thread.sleep(1000);
 
 act.sendKeys(Keys.ARROW_DOWN).perform();
 Thread.sleep(1000);
 
 // select the value
 act.sendKeys(Keys.ENTER).perform();
 
	}

	private static Actions sendKeys(Keys arrowUp) {
		// TODO Auto-generated method stub
		return null;
	}

}
