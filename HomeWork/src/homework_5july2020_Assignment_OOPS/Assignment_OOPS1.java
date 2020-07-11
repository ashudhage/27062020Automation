package homework_5july2020_Assignment_OOPS;

public class Assignment_OOPS1 
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		System.out.println(a.x);
		//System.out.println(a.y);  CE: we can not access child class variable using parent reference
		System.out.println(b.x);
		System.out.println(b.y);

	}

}

class A
{
	String x="Parent";
}

class B extends A
{
	String y="Child";
}
