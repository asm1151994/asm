package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {
	public static String excelData(int row, int col) throws Exception
	{
		FileInputStream file = new FileInputStream("E:\\ST-Data\\Fw-Guru99\\Git\\import\\asm\\TestData\\testData.xls");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Data");
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	
	}
}
