package programs_practice;

public class StaticDemo {
	
	static int a=10;
	static int b=20;
	static String name="Kumar";
	
	static void staticmethod()
	{
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(name);
	}
	
	void nonstaticmethod()
	{
		System.out.println("This is non static method...");
	}
	
	

	public static void main(String[] args) {
		
		StaticDemo.staticmethod();
		
		StaticDemo sd=new StaticDemo();
		
		sd.nonstaticmethod();

	}

}
