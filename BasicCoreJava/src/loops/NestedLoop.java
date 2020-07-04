package loops;

public class NestedLoop 
{

	public static void main(String[] args)
	{
		for(int rows=0;rows<3;rows++)
		{
			for(int cols=0;cols<3;cols++)
			{
				System.out.print("rows--> " +rows + "cols--> " +cols);
			}
			System.out.println();
		}
	}

}
