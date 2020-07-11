package homework_5july2020_Assignment_OOPS;

public class Assignment_OOPS2 
{
	public static void main(String[] args) 
	{
		AA a = new AA();
		BB b = new BB();

		a.parentMeth();
		// a.childMeth(); CE : we can not access child class method using parent reference 

		b.childMeth();
		a.parentMeth();

	}
}

class AA
{
	public void parentMeth()
	{
		System.out.println("In parent class method ! ");
	}
}

class BB extends AA
{
	public void childMeth()
	{
		System.out.println("In Child class method ! ");
	}
}
