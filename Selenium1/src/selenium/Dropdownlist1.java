package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdownlist1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
Thread.sleep(1000);

// select skill list box
WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));

// Create object of actions class
Actions act = new Actions(driver);
Thread.sleep(1000);

// click on clik button
act.click(skills).perform();

// move one step downword
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(1000);

//move one step downword
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(1000);

//move one step downword
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(1000);

//move one step downword
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(1000);

// move one step upword

act.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(1000);

act.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(1000);

act.sendKeys(Keys.ARROW_UP).perform();
Thread.sleep(1000);

// select the value
act.sendKeys(Keys.ENTER).perform();


	}

}
