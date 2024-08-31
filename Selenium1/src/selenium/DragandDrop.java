package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Static.html");
driver.manage().window().maximize();
Thread.sleep(1000);

//create xpath of source
WebElement src = driver.findElement(By.xpath("(//img[@src=\"original.png\"])[2]"));
Thread.sleep(1000);

// create xpath of destination 
WebElement dest = driver.findElement(By.xpath("//div[@class=\"dragged\"]"));
Thread.sleep(1000);

// create object of actions class
Actions act =  new Actions(driver);
Thread.sleep(1000);

// use drag and drop method
act.dragAndDrop(src, dest);

	}

}
