package Expleopractice24.Automation_exp;



class Parent {
	
	void meth1()
	{
	System.out.println("This is first method from parent");
	}
	void meth2()
	{
		System.out.println("This is second method from parent");
	}
	void meth3()
	{
		System.out.println("This is third method from parent");
	}
	void meth3(int a, int b)
	{
		System.out.println("This is 3rd method with parameter a="+a);
		System.out.println("This is 3rd method with parameter b="+b);
	}
	
}


public class Inheritance extends Parent {
	void meth3()
	{
		System.out.println("This is third method from child");
	}

	public static void main(String[] args) {
		
		Inheritance in = new Inheritance();
		in.meth3();
		in.meth2();
		in.meth3(30, 40);

	}

}
