package framWorkDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ExcelDriven {
	
// All were declared as global variable so that we can access it outside the method also.	
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static boolean value;
	
	
//provide the cell which needed to be retrieved or set
	public static void main(String[] args) throws IOException {
		
		value= getCellData(2,2);
		System.out.println(value);
// After doing this we can use it in selenium like below.
// driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(value);
					
		String SetVal =setCellData("prem", 1, 2);
		System.out.println(SetVal);
		
	}

// Method created separately to get the data.	
	public static boolean getCellData(int rowNum, int cellNum) throws IOException {
		
		file = new FileInputStream("C:\\Users\\spice\\Java Work\\data.xlsx");
		
		wb = new XSSFWorkbook(file);			// workboot object -- > send file
		sheet = wb.getSheet("script");			// Sheet object -- > send sheet name
		row = sheet.getRow(rowNum);				// row object -- > send rownum
		cell = row.getCell(cellNum);			// cell object -- > send cellnum
		
		return cell.getBooleanCellValue();
				
	}
	

	// Method created separately to set the data.	
		public static String setCellData(String str, int rowNum, int cellNUm) throws IOException {
			
			file = new FileInputStream("C:\\Users\\spice\\Java Work\\data.xlsx");
			
			wb = new XSSFWorkbook(file);			// workboot object -- > send file
			sheet = wb.getSheet("script");			// Sheet object -- > send sheet name
			row = sheet.getRow(rowNum);				// row object -- > send rownum
			cell = row.getCell(cellNUm);			// cell object -- > send cellnum
			
			cell.setCellValue(str);
			
			return cell.getStringCellValue();
					
		}
		
		

}
