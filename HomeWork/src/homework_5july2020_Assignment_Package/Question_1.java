package homework_5july2020_Assignment_Package;

public class Question_1 
{
	public static void main(String[] args) 
	{
		try
		{
			int o[] = new int[2];
			o[3]=23;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();   // it will print exception name, location, description
		}
	}
}
