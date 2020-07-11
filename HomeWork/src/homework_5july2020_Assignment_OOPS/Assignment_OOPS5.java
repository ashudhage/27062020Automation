package homework_5july2020_Assignment_OOPS;

public class Assignment_OOPS5 
{
	public static void main(String[] a)
	{
		A11 a1 = new B11();
		a1.meth1();
		a1.meth2();
		a1.meth3();
		//a1.meth4(); //CE : meth4 is not declared in interface A11,
		// so we can not call meth4 form B11 class using interface reference
	}
}

interface A11
{
	public void meth1();
	public void meth2();
	public void meth3();
}



class B11 implements A11
{
	@Override
	public void meth1() 
	{
		System.out.println("meth1");
	}

	@Override
	public void meth2()
	{
		System.out.println("meth2");
	}
	
	@Override
	public void meth3()
	{
		System.out.println("meth3");
	}

	public void meth4() 
	{
		System.out.println("meth4");
	}
}

