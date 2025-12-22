package day14;

class A                //parent class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A       //child class        
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
	
	void sum()
	{
		System.out.println(a+b+c);
	}
	
}




public class InheritenceTypes {            //Single and multi level inheritence

	public static void main(String[] args) 
	{
		/*B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.show();
		obj.display();*/
		
		C objj=new C();
		objj.a=100;
		objj.b=300;
		objj.c=90;
		
		objj.sum();


	}

}

