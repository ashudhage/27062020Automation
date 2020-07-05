package functions;

import java.util.Scanner;

public class Functions1
{
	public static void main(String[] args) throws Exception
	{
		Functions1 obj=new Functions1();
		obj.sum();
	}
	
	
	//Access modifier   //nature of method    // return type    // method name
	public               static                 void             sum() throws Exception
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Number : ");
			int num1=sc.nextInt();
			System.out.println("Enter Second Number : ");
			int num2=sc.nextInt();
		
			int Result=num1 + num2;
			System.out.println("Sum of two numers : " +Result);
		}
		catch(Exception e)
		{
			System.exit(0);
		}
	}

}
