package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipelinksfind {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(1000);

List<WebElement> v = driver.findElements(By.xpath("//a"));

for(WebElement b : v)
{
	String str =b.getText();
	System.out.println(str);
}
}

}
