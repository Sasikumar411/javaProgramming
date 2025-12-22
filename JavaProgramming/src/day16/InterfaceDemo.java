package day16;

interface Shape{
	int length=10;
	int width=20;
	
	void circle();    //interface is a deault public method
	
	default void square()
	{
		System.out.println("This is square....default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle.....static method");
	}
	
}


public class InterfaceDemo implements Shape{
	
	//scenario:1
	
	public void circle()    //interface is a deault public method
	{
		System.out.println("This is circle....abstract method");
	}
	
	void  triangle()
	{
		System.out.println("This is triangle");
	}
	
	int x=100,y=200;

	public static void main(String[] args) 
	{
		InterfaceDemo idobj=new InterfaceDemo();
		
		idobj.circle();   //abstarct
		idobj.square();   //default
		idobj.triangle();
		Shape.rectangle();  //static method can directly access from interface
		System.out.println(idobj.x+idobj.y);
		
		Shape sh=new InterfaceDemo(); //Variable of interface can hold the object of a child class.
		
		sh.circle(); //abstract
		sh.square(); //default
		Shape.rectangle();   //static method can directly access from interface
		//sh.triangle  //we cannot access
		
		System.out.println(sh.length+sh.width);  //accessing static variables directly within the static method
		
	
		
		

	}

}
