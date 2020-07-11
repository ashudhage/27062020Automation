package homework_5july2020_programs;

public class Assignment1_Q10
{
	/* Suppose there is an integer array holding following elements:
		1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1

		Write a program which prints which each number from array and the times it has been repeated in array	
		
		Fox eg
		1- Repeated 3 times
		4- Repeated 6 times
	 */
	int [] num= {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
	int count=0;
	public static void main(String[] args)
	{
		Assignment1_Q10 obj=new Assignment1_Q10();
		obj.printArray();
		obj.uniqueValueInArray();
	}
	
	public void printArray()
	{
		System.out.println("Numbers present in array : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" " +num[i]);
		}
	}
	
	public void uniqueValueInArray()
	{
		int i,j;
		int n=num.length;
	
		System.out.println("Unique numbers present in array : ");
		
		for(i=0;i<n;i++)
		{
			System.out.print(num[i] + "  ");
			for(j=0;j< i ;j++)
			{
				if(num[i]==num[j])
					break;
				if(i==j)
					System.out.print(num[i] + "  ");
			}
			
		}
		
	}
}

	