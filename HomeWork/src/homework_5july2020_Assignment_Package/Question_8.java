package homework_5july2020_Assignment_Package;

public class Question_8
{
	public static void main(String[] args)
	{
		try
		{
			int a=divide(4,2);
			System.out.println(a);
			int b=divide(4,0);
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	
	public static int divide(int a,int b) 
	{
		int result=a/b;
		return result;
	}
}
