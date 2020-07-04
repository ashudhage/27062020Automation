package array;

public class Array2 {

	public static void main(String[] args) 
	{
		String [][] login=new String[2][3];
		login[0][0]="'ashu','100'";
		login[0][1]="'amol','101";
		login[0][2]="'raj',''102'";
		//login[0][3]="'ash','103'";
				
		
		for(int r=0;r<login.length;r++)
		{
			for(int c=0;c<login[r].length;c++)
			{
				System.out.println(login[r][c]);
			}
		}
		

	}

}
