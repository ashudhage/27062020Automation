package ifElseStaements;

public class IfElseClass3NestedIfElse 
{
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b)
		{
			if(a>c)
				System.out.println("a is the greatest number.!!");
		}
		
		else if(b>c)
		{
			if(b>a)
				System.out.println("b is the greatest number..!!");
		}
		
		else
			System.out.println("c is the greatest number..!!");
	}
}
