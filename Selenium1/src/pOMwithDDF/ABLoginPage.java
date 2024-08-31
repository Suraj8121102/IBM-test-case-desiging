package pOMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABLoginPage {
	
//step-1 Declration
	@FindBy(xpath = "(//input[@class=\"input_error form_input\"])[1]") private WebElement UN;
	@FindBy(xpath = "//input[@type=\"password\"]") private WebElement PW;
	@FindBy(xpath = "//input[@id=\"login-button\"]") private WebElement LoginB;
	
	// step-2 initilization 
	public ABLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// utilization
	public void EnterUN(String username)
	{
		UN.sendKeys(username);
	}
	public void enterPW(String password)
	{
		PW.sendKeys(password);
	}
	public void clicklogin()
	{
		LoginB.click();
	}
}