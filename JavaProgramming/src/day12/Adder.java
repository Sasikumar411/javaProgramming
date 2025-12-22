package day12;

public class Adder {
	
	int a=10, b=20;
	
	void sum()       //1st method   (Method names should be same)
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)   //2nd method    (Number of parameters should be different)
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)    //3rd method     (Data type of parameters should be different)
	{
		System.out.println(x+y);
		
	}
	
	void sum(double x, int y)    //4th method        (Order of parameters should be different)
	{
		System.out.println(x+y);
		
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b-c);
	}
	
	//void sum(double x, double y, double z)
	{
	//	System.out.println(x+y+z);
	}
}
