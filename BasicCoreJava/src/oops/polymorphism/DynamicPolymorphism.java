package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism
{
	public static void main(String[] args)
	{
		Telephone obj4=null;  // here Telephone acts as a webdriver

		String browserName="Chrome";

		if(browserName.equals("Chrome")) // Chrome & FIrefox as a driver 
		{
			obj4=new Mobile();
	    }
		else if(browserName.equals("FireFox"))
		{
			obj4=new SmartPhone();
		}
	
		obj4.calling(); // actual script
		
	}

}
