package com.crm.vtiger.genericFileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
/**
 * This class if for Excel utility
 * @author Mohammad Yusuf
 *
 */
public class ExcelFileUtility {
	/**
	 * This method is used to read the data from the excel file and return the same
	 * @param sheet
	 * @param row
	 * @param Cell
	 * @return
	 * @throws Exception
	 */
	public String readFromExcelFile(String sheet, int row, int Cell) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet(sheet).getRow(row).getCell(Cell).getStringCellValue();
		return cellValue;
	}
	public double readNumericValueFromExcel(String sheet, int row, int Cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		double numericValue = wb.getSheet(sheet).getRow(row).getCell(Cell).getNumericCellValue();
		return numericValue;
	}
}
