package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface
{
	public static void main(String[] args) 
	{
		List<String> list=new LinkedList<>();		
		list.add("ashu");
		list.add("raj");
		list.add("amol");
		list.add("sharu");
		list.add("ketan");
		list.add("priya");
		list.add("raj");
		list.add("amol");
		
		for(String name : list)
		{
			System.out.println(name);
		}
		
	}

}
