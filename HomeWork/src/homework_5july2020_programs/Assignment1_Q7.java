package homework_5july2020_programs;

public class Assignment1_Q7
{
	//  Print alternate elements of String array array
	
	public static void main(String[] args)
	{
		String [] s= {"I","am","learning","selenium","with","java","in","TechBodhi"};
		System.out.println(" String Length : " +s.length);
		
		// Printing original array
		
		System.out.println("Original array : ");
		for(int i=0;i<s.length;i++)
			System.out.print("  "+s[i]);
		
		// Alternative values from array
		
		System.out.println();
		System.out.println("Alternative values from String array : ");
		for(int i=0;i<=s.length;i++)
		{
			if(i%2 !=0)
				System.out.print("  "+s[i]);
			   
		}
	}
}
