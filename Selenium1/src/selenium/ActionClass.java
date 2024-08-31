package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
Thread.sleep(1000);

WebElement target = driver.findElement(By.xpath("//a[@aria-label=\"Gmail \"]"));

//create object of actions class
 Actions act = new Actions(driver);
 Thread.sleep(1000);
 
 /* go to target element
 act.moveToElement(target).perform();
 Thread.sleep(1000);
 
  right click
 act.contextClick(target).perform();
 act.click(target).perform();
 
 do double click
 act.doubleClick(target).perform();*/
 act.moveToElement(target).contextClick(target).doubleClick(target).build().perform();

	}

}
