package VariablesAndDataTypes;

public class ArithmaticOperator
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		String c="anand";
		
		System.out.println("a+b+c : " +(a+b+c)); //30anand
		System.out.println("a+c+b : " +(a+c+b)); //10anand20
		System.out.println("c+a+b : " +(c+a+b)); //anand1020
		System.out.println(b-a);
		System.out.println(a*b);
	    System.out.println(b/a);
	    System.out.println(b%a);
	}

}
