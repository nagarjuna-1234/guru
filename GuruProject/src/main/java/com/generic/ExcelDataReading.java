package com.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReading {

	public static int getRowCount(String path, String sheet) {
		int rc = 0;
		System.out.println("path:"+path);
		System.out.println("sheet:"+sheet);
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			rc = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rc;
	}

	public static String getCellValue(String path, String sheet, int row, int cell) {

		String v = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			v = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return v;

	}
}
