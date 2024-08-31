package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdownlist {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// select skill
		WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		// create an object of action class
		 Actions act = new Actions(driver);
		 Thread.sleep(1000);
		 
		 // click skills
		 act.click(skills).perform();
	
		
	}

}
