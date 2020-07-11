package homework_5july2020_Assignment_Package;

public class Question_2 
{
	public static void main(String[] args)
	{
		try
		{
			int o[] = new int[2];
			o[3]=23;
			o[1]=33;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// System.out.println(o[1]); 
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	o cannot be resolved to a variable
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	o cannot be resolved to a variable

		  */
		 
	}


}
