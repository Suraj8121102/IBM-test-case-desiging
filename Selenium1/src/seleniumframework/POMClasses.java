package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClasses {

// Login Page
		//Step 1 Declaration 
		@FindBy(xpath ="//input[@id=\"user-name\"]" ) private WebElement UN;
		@FindBy(xpath = "//input[@id=\"password\"]") private WebElement PW;
		@FindBy (xpath = "//input[@id=\"login-button\"]") private WebElement login;
		
		//Initialization
		public POMClasses(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		// utilization
		public void EnterUN()
		{
			UN.sendKeys("standard_user");
			
		}
		
		public void enterPW()
		{
			PW.sendKeys("secret_sauce");
		}
		public void clicklogin()
		{
			login.click();
		}
		
		
	}

