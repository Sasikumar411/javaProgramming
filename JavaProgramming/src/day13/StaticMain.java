package day13;

public class StaticMain {

	public static void main(String[] args) 
	{
		// 1) static methods can access static stuff directly (without object).
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
				
				
		//2) static methods can access non-static stuff through object.
		StaticDemo sd=new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
				
				
		//3) non-static method can access everything directly.
		sd.m();
		System.out.println(StaticDemo.a);
				

	}

}
