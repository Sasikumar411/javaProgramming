package day11;

public class ConstructorDemo {
	
	
	int x,y;
	
	ConstructorDemo()     //default constructor
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		//ConstructorDemo s=new ConstructorDemo(); //Invoke default constructor
		//s.sum();
		
		ConstructorDemo cd=new ConstructorDemo(30,45);
		cd.sum();
		

	}

}
