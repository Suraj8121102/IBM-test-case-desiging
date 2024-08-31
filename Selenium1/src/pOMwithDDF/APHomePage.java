package pOMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APHomePage {
	
		// declaration
			@FindBy(xpath = "(//div[@class=\"inventory_item_name \"])[1]") private WebElement Backpack1;
			@FindBy(xpath = "//button[@class=\"btn btn_primary btn_small btn_inventory\"]") private WebElement AddToCart1;
			
			// initilization
			public APHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public void MyBackpack()
			{
				Backpack1.click();
				
			}
			public void Addcart()
			{
				AddToCart1.click();
			}
}

