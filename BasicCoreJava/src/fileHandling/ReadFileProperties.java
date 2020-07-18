package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileProperties
{
	public static void main(String[] args) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		// in path \\ means skip sequence
	
		obj.load(file);
		System.out.println(obj.get("name"));
		System.out.println(obj.get("sirname"));
		System.out.println(obj.get("city"));
		System.out.println(obj.get("company"));
	}

}
