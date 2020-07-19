package excelFunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static void main(String[] args) throws IOException
	{
		String path="D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);  //workbook
		
		XSSFSheet sheet=wb.getSheet("sheet1");   //sheet
		
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows in Sheet :  "+rows);
		XSSFRow row=sheet.getRow(0);
		
		System.out.println("Total Columns in Sheet :  "+row.getPhysicalNumberOfCells());
		XSSFCell cell=row.getCell(0);
		
		String data=cell.getStringCellValue();
		System.out.println(data);
	}

}
