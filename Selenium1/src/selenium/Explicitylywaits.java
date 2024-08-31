package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitylywaits {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// create object of action class
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label=\"Gmail \"]")));
		element.click();
		}

}
