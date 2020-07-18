package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 
{
	public static void main(String[] args) 
	{
		// 1 . ashu
		// 2. madhu
		// 3. sharu
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "ashu");
		map.put(2, "madhu");
		map.put(3, "sharu");
		
		//System.out.println(map.get(2));
		
		Set<Integer> set=map.keySet();
		
		for(int key : set)
		{
			System.out.println(map.get(key));
		}	
				
	}

}
