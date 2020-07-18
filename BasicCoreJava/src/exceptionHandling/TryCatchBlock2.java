package exceptionHandling;

public class TryCatchBlock2 
{
	public static void main(String[] args)
	{
		try 
		{
			// verify about link is present
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// verify download link is present
			String[] str = new String[2];
			str[1] = "anand";

			// verify project link is present
			String s = "ashu";
			System.out.println(s.length());

		}

		catch (ArithmeticException e) 
		{
			System.out.println("Exception occured ! :" + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception occured ! :" + e.getMessage());
		}
		catch (NullPointerException e) 
		{
			System.out.println("Exception occured ! :" + e.getMessage());
		}

	}

}
