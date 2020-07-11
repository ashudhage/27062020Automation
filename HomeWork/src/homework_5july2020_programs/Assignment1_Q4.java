package homework_5july2020_programs;

public class Assignment1_Q4
{
	// Write a for loop to find the sum of first 100 numbers(1 to 100)
	
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of 1 to 100 numbers is : " +sum);
	}
}
