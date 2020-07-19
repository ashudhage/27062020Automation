package stringClass;

public class TestString
{
	public static void main(String[] args) 
	{
		String str="Selenium";
		
		System.out.println(str.substring(1)); // start from 1 to end
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.toLowerCase());
		 
		System.out.println(str.toUpperCase());
		
		System.out.println(str.replace("S", "s"));
		
		String [] arr=str.split("len");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}
