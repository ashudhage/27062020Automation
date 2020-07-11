package functions;

public class Car
{
	String colour;
	int capacity;
	
	Car(String colour,int capacity)
	{
		this.colour=colour;
		this.capacity=capacity;
	}
	
	public void features()
	{
		System.out.println("car features are : " +capacity +"  and " +colour);
	}

}
