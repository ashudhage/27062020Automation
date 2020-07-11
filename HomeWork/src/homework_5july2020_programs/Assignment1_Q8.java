package homework_5july2020_programs;

public class Assignment1_Q8
{
	//Find the greatest number in a array
	
	public static void main(String[] args)
	{
		int [] num= {60,80,20,50,40,30,10,100,90,70};
		int max=num[0];
		
		// printing array values
		
		System.out.println("Array Values : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" " +num[i]);
		}
		
		// finding Greatest number in array
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i] > max)
			{
				max=num[i];
			}
		}
		System.out.println();
		System.out.println("Greatest number in array is : " +max);
	}
}
