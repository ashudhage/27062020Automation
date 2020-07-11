package homework_5july2020_programs;

public class Assignment1_Q6
{
	//Make an integer array. Write a for loop to print the integer array in reverse.
	
	public static void main(String[] args) 
	{
		int [] num= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Size of array is : " +num.length);
		
		// Printing of original array
		System.out.println("Original Array : ");
		for(int i=1;i<=num.length;i++)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		
		// Array in reverse order
		System.out.println("Array in Reverse oreder : ");
		for(int j=num.length;j>=1;j--)
		{
			System.out.print(" " +j);
		}
	}

}
