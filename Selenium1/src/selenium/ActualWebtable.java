package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualWebtable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
Thread.sleep(1000);

List<WebElement> rowlist = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr"));
System.out.println("Number of rows: " +rowlist.size());

List<WebElement> columnlist = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[1]/th"));
System.out.println("Number of Columns :"+columnlist.size());

for (int r = 2 ; r<=rowlist.size(); r++)
{
	for (int c = 1 ; c<=columnlist.size(); c++)
	{
		  String data = driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr["+ r +"]/td[" + c + "]")).getText();
		 System.out.println(data);
	}
}
	}

}
