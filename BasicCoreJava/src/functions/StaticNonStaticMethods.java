package functions;

public class StaticNonStaticMethods
{
	static String name="Ashwini";
	int age=28;
	
	public static void main(String[] args)
	{
		StaticNonStaticMethods obj=new StaticNonStaticMethods();
		System.out.println("nane : " +name);
		System.out.println(obj.age);
	}

}
