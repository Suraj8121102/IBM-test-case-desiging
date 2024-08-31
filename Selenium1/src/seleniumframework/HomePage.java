package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
// declaration
	@FindBy(xpath = "(//div[@class=\"inventory_item_name \"])[1]") private WebElement Backpack;
	@FindBy(xpath = "//button[@class=\"btn btn_primary btn_small btn_inventory\"]") private WebElement AddToCart;
	
	// initilization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void MyBackpack()
	{
		Backpack.click();
		
	}
	public void Addcart()
	{
		AddToCart.click();
	}
}
