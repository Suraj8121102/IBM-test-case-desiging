package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetdata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream("D:\\skkk.xlsx");
Thread.sleep(2000);

// open excel sheet
String data = WorkbookFactory.create(file).getSheet("skkk").getRow(0).getCell(0).getStringCellValue();
System.out.println(data);

	}
}
