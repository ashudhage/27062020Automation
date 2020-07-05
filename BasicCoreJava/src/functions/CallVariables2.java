package functions;

public class CallVariables2 
{
	public static void main(String[] args)
	{
		System.out.println(Variables2.collageName);
		
		Variables2 obj=new Variables2();
		System.out.println(obj.rollNo);
		System.out.println(obj.studentName);
		
		Variables2.collageName="Sinhgad";
		
		System.out.println("After changing static value : ");
		
		Variables2 obj2=new Variables2();
		obj2.studentName="Sharu";
		obj2.rollNo=110;
		System.out.println(Variables2.collageName);
		System.out.println(obj2.studentName);
		System.out.println(obj2.rollNo);
		
		
	}

}
