package Expleopractice24.Automation_exp;


public class Test {



	static int z = 5;  //Static variable
	int y = 1;   //Global variable
	
	public static void a()
	{
		z = 10;
		System.out.println(z);
	}
	public void b()
	{
		z = 15;
		System.out.println(z);
		a();
	}
	public static void main(String[] args)
	{
		System.out.println(z);
		a();
		Test C5 = new Test ();
		C5.b();
		System.out.println(z);
	}
}


