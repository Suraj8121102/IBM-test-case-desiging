package seleniumframework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMClasses2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

// 1st POM CLASS OBJECT
POMClasses ABP = new POMClasses(driver);
ABP.EnterUN();
ABP.enterPW();
ABP.clicklogin();

//2nd POM CLASS OBJECT
POMClasses1 SURAJ =new POMClasses1(driver);
SURAJ.MyBike();
SURAJ.Addcart();
	}

}
