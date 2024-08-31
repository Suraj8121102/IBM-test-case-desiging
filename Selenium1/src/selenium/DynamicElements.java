package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Gaming laptop",Keys.ENTER);
Thread.sleep(2000);

String data = driver.findElement(By.xpath("(//div[@class=\"_5OesEi\"])[1]")).getText();
System.out.println(data);
 

String v = driver.findElement(By.xpath("(//div[@class=\"_5OesEi\"])[1]//span[3]")).getText();
System.out.println(v);

//String A = driver.findElement(By.xpath("")).getText();
//System.out.println(A);
}

}
