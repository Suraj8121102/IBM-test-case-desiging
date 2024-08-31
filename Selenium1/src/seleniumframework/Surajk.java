package seleniumframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surajk {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fs = new FileInputStream("D:\\Suraj.xlsx");
Sheet abc = WorkbookFactory.create(fs).getSheet("Sheet1");

WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
//global wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

// enter username
String username = abc.getRow(1).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@class=\"input_error form_input\"]")).sendKeys(username);

//enter password

String ps = abc.getRow(1).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys(ps);

//click on login button
driver.findElement(By.xpath("//input[@data-test=\"login-button\"]")).click();


}

}
