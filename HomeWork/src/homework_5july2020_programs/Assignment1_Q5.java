package homework_5july2020_programs;

public class Assignment1_Q5
{
	/*Write program to display following output

		1
		12
		1234
		12345
		123456
		1234567*/

	public static void main(String[] args)
	{
		for(int rows=1;rows<7;rows++)
		{
			for(int cols=1;cols<=rows+1;cols++)
			{
				System.out.print(cols);
			}
			
			System.out.println();
		}
	}
}
