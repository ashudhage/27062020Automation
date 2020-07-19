package excelFunction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader
{
	// path is common throughout the functions
	
	public String getCellData(String pathName,String sheetName,int rowNum, int cellNum) throws IOException
	{
		String path="D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);  //workbook
		
		XSSFSheet sheet=wb.getSheet("sheet1");   //sheet
		
		XSSFRow row=sheet.getRow(rowNum);
		
		int cols=row.getLastCellNum();
		System.out.println("Total Rows in Sheet :  "+cols);
		
		XSSFCell cell=row.getCell(cellNum);
		
		String data=cell.getStringCellValue();
		//System.out.println(data);
		return data;		
	}

}
