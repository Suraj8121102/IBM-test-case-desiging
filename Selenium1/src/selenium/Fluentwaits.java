package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
 driver.get("https://www.google.co.in/");
 driver.manage().window().maximize();
 
 // create object of fluentwaits
 Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
 .withTimeout(Duration.ofSeconds(10))
 .pollingEvery(Duration.ofSeconds(2))
 .withMessage("This is custom message")
 .ignoring(NoSuchElementException.class);
 
//WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Wrong input")));
 WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label=\"Gmail \"]")));
element.click();
 
	}

	private static void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private static void withMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private static void WithTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}
