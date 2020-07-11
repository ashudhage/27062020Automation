package homework_5july2020_Assignment_Package;

public class Question_5 
{
	public static void main(String[] args)
	{
		// CE : Unhandled exception (shuold handle exception for main method either same or its parent)
		// without creating reference variable, we are calling divide() method
		//divide(4,2);
		//divide(4,0);

	}
	
	public static int divide(int a,int b) throws Exception
	{
		int result = a/b;
		return result;
	}
}
