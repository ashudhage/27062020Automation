package exceptionHandling;

public class TryCatchBlock
{
	public static void main(String[] args) 
	{
		try
		{
			// verify about link is present
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured ! :" +e.getMessage());
		}

		
		try
		{
			// verify download link is present
			String [] str=new String[2];
			str[5]="anand";
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured ! :" +e.getMessage());
		}

		
		try
		{
			// verify project link is present
			String s=null;
			System.out.println(s.length());
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured ! :" +e.getMessage());
		}

	}

}
