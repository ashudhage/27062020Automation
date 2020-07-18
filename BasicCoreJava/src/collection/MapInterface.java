package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface
{
	public static void main(String[] args)
	{
		Map <String,String> map=new HashMap<>();
		map.put("name", "Ashwini Dhage"); 
		map.put("email", "ashudhage@gmail.com");
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		map.put(null, "ash");
		System.out.println(map.get(null));
		
		// here, key is : name,email(like heading of hashtable)
		// and, "Ashwini Dhage" "ashudhage@gmail.com" is values
	}

}
