package array;

public class Array3 
{
	public static void main(String[] args) 
	{
		int [][] login=new int [2][10];
		
		//row 1
		login[0][0]=1;
		login[0][1]=2;
		login[0][2]=3;
		login[0][3]=4;
		login[0][4]=5;
		login[0][5]=6;
		login[0][6]=7;
		login[0][7]=8;
		login[0][8]=9;
		login[0][9]=10;
		
		//row 2
		login[1][0]=1;
		login[1][1]=2;
		login[1][2]=3;
		login[1][3]=4;
		login[1][4]=5;
		login[1][5]=6;
		login[1][6]=7;
		login[1][7]=8;
		login[1][8]=9;
		login[1][9]=10;
		
		for(int r=0;r<login.length;r++)
		{
			for(int c=0;c<login[r].length;c++)
			{
				System.out.println(login[r][c]);
			}
		}
	}

}
