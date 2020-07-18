package homework_5july2020_programs;

import java.util.Arrays;

/* Suppose there is an integer array holding following elements:
1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1

Write a program which prints which each number from array and the times it has been repeated in array	

Fox eg
1- Repeated 3 times
4- Repeated 6 times
*/

public class Assignment1_Q10
{
	public static void main(String[] args)
	{	
		int arr[] = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
	    int n = arr.length;
	    int i, j;
	
	    System.out.print("The array is: ");
	    
	    for (i = 0; i < n; i++)
	    {
	    	System.out.print(arr[i] + " ");
	    }
	    
	    System.out.print("\nThe distinct elements of above array are: ");
	    
	     for (i = 0; i < n; i++) 
	     {
	         for (j = 0; j < i; j++)
	         {
	        	 if (arr[i] == arr[j])
	        		 break;
	        	 if (i == j)
	        		 System.out.print( arr[i] + " ");
	         }
	     }
	}
}

	