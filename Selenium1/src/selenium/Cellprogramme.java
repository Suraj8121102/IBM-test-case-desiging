package selenium;

import java.util.List;

import javax.sql.RowSetListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cellprogramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/Admin/Desktop/Suraj.html");
driver.manage().window().maximize();

String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
System.out.println(text);

List<WebElement> rowlist = driver.findElements(By.xpath("//table/tbody/tr"));
System.out.println("Number of Rows:"  +rowlist.size());

List<WebElement> columnlist = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
System.out.println("Number of Column : " +columnlist.size());

for (int r = 2; r<=rowlist.size();r++)
{
	for(int c=1; c<=columnlist.size();c++)
	{
		String data = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td[" + c + "]")).getText();
		System.out.println(data);
	}
}
	}

}
