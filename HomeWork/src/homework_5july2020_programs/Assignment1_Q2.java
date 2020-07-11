package homework_5july2020_programs;

public class Assignment1_Q2 
{
	// Write a for loop to print even numbers between 1 to 100
	
	public static void main(String[] args)
	{
		System.out.println("Even numbers between 1 to 100 are : ");
		System.out.println();
		
		
		for(int i=1;i<=100;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(" " +i);
			}
		}
	}

}
