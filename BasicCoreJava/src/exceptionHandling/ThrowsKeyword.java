package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.test1();
		obj.test2();
		
	
	}
	
	public static void test1() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		System.out.println("test1");
	}
	
	public static void test2()
	{
		try 
		{
			FileInputStream file=new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
    
}
