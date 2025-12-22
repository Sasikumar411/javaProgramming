package day13;

public class StaticDemo {

	static int a=10;    //static variable
	int b=20;
	
	static void m1()         //static method
	{
		
		System.out.println("This is m1 static method");
	}
	
	void m2()
	{
		System.out.println("This is m2 non-static method");    //non-static method
	}
	
	void m()       //non-static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	/*public static void main(String[] args) 
	{
		
		// 1) static methods can access static stuff directly (without object).
		System.out.println(a);
		m1();
		
		
		//2) static methods can access non-static stuff through object.
		StaticDemo sd=new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
		
		
		//3) non-static method can access everything directly.
		sd.m();
		System.out.println(a);
		

	}*/

}
