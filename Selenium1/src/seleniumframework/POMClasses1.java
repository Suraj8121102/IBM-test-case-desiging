package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClasses1 {

	
		//Home Page
				@FindBy(xpath = "(//div[@class=\"inventory_item_name \"])[2]") private WebElement Bike;
				@FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]") private WebElement Addcart;
				
				//initialization
				public POMClasses1(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				
				//utilization
				
				public void MyBike()
				{
					Bike.click();
				}
				
				public void Addcart()
				{
					Addcart.click();
				}
				
			
	}


