package oops.inheritance;

public class Users
{
	public static void main(String[] args) 
	{
		SmartPhone sm=new SmartPhone();
		sm.calling();
		sm.texting();
		sm.videoCall();
		
		Mobile mob=new Mobile();
		mob.calling();
		mob.texting();
		
		Telephone tp=new Telephone();
		tp.calling();
	}

}
