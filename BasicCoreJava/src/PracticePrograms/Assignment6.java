package PracticePrograms;

public class Assignment6
{
	public static void main(String []args)
	{
		// create array to store fruit name
		//  create array for fruit prize
		// size 10*5
		
		String[] fruitName= {"Apple","Orange","Guava","Kiwi","Grapes","Cherry","Plum","Banana","Mango","Strawberry"};
		int [] prize= {100,50,60,120,150,300,250,40,300,150};
		
		for(String name : fruitName)
		{
			System.out.println("Fruit Name : " +name);
		}
		
		
		for(int i : prize)
		{
			System.out.println(i);
		}
		
		
		
	}
}
