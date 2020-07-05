package functions;

public class Functions2
{
	public static void main(String[] args) 
	{
		Functions2 obj=new Functions2();
		obj.eligible(10);
	}
	
	public boolean eligible(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible");
			return true;
		}
		else
		{
			System.out.println("Not eligible");
			return false;
		}	
	}
	
}
