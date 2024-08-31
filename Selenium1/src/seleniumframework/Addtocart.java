package seleniumframework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

// 1st class object
LoginPage A = new LoginPage(driver);
A.EnterUN();
A.enterPW();
A.clicklogin();

// 2ND CLASS OBJECT

HomePage AB =  new HomePage(driver);
 AB.MyBackpack();
 AB.Addcart();
 
	}

}
