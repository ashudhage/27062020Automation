package excelFunction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData 
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
		
		int cols=row.getLastCellNum();
		System.out.println("Total Rows in Sheet :  "+cols);
		
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				String data=sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(data);
			}
		}
	}

}