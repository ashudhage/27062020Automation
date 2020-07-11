package homework_5july2020_programs;

public class Assignment1_Q3 
{
	/* Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5,
	it prints 'divisible by 5 followed by that number' */
	
	public static void main(String[] args) 
	{
		System.out.println("Divisible by 5 numbers between 1 to 100 are : ");
		System.out.println();
		
		for(int i=1;i<=100;i++)
		{   
			if(i % 5 !=0)
				System.out.println(i);
		
			if(i % 5 ==0)
				System.out.println(i +" is divisible by 5 ");
		}
	}
}
