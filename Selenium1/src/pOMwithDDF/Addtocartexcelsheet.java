package pOMwithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumframework.HomePage;
import seleniumframework.LoginPage;

public class Addtocartexcelsheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fs = new FileInputStream("D:\\Suraj.xlsx");
		Sheet suraj = WorkbookFactory.create(fs).getSheet("Sheet1");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1st class object
		String username = suraj.getRow(1).getCell(0).getStringCellValue();
		
		ABLoginPage S = new ABLoginPage(driver);
		
		S.EnterUN(username);
		
	String password = suraj.getRow(2).getCell(0).getStringCellValue();
	S.enterPW(password);
	
	S.clicklogin();
//CALL 2ND POM CLASS
	APHomePage AC = new APHomePage(driver);
	AC.MyBackpack();
	AC.Addcart();
		// 2ND CLASS OBJECT

		HomePage AB =  new HomePage(driver);
		 AB.MyBackpack();
		 AB.Addcart();
	}

}
