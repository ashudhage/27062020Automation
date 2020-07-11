package homework_5july2020_programs;

public class Assignment1_Q9 
{
	// Find the least number in a array
	
	public static void main(String[] args)
	{
		int [] num= {50,30,70,90,10,20,40,100,80,60,100};
		int min=num[0];
		
		// printing array values
		
		System.out.println("Array values : ");
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" " +num[i]);
		}
		
		// finding least number in array
		
		System.out.println();
		for(int i=1;i<num.length;i++)
		{
			if(num[i] < min)
			{
				min=num[i];
			}
		}
		
		System.out.println();
		System.out.println("The least number value in array is : " +min);
	}
}
