package homework_5july2020_Assignment_Package;

public class Question_13 
{
	public static void main(String[] args) 
	{
		try 
		{
			xyz();
		} 
		catch (Exception e) 
		{
			System.out.println("error 1");
			e.printStackTrace();
		}
	}

	public static void xyz() throws Exception
	{
		throw new Exception("Some exception");
	}
}
