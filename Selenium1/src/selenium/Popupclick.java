package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://blog.hubspot.com/website/website-pop-up");
driver.manage().window().maximize();

//click on popup
driver.findElement(By.xpath("//button[@id=\"hs-eu-confirmation-button\"]")).click();

	}

}
