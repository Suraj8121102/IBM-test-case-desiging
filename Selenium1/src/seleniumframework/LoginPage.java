package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
	//declaration 
	
@FindBy(xpath = "//input[@class=\"input_error form_input\"]") private WebElement UN;
@FindBy(xpath = "//input[@type=\"password\"]") private WebElement PW;
@FindBy(xpath = "//input[@value=\"Login\"]") private WebElement Login;

//initilization

public LoginPage(WebDriver driver)
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
	Login.click();
}
}
