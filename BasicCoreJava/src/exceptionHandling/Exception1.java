package exceptionHandling;

public class Exception1 
{
	public static Function1 fun; // creating reference variable of class "Function1"
	
	public static void main(String[] args) throws Exception
	{
		// 1st Exception : java.lang.ArithmeticException: / by zero
		int a=10;
		int b=0;
		//System.out.println(a/b);
		
		
		// 2 nd Exception : java.lang.ArrayIndexOutOfBoundsException
		//String [] str=new String[2];
		//str[5]="anand";
		
		
		// 3 rd Exception :  java.lang.NullPointerException
		//fun.fun1();
		
		throw new Exception("testing");
		
		
	}

}


// checked exception : @compile time
// unchecked exception : @run time

// Exceptions and error