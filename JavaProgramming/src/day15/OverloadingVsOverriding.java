package day15;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)       
	{
		System.out.println(a*a);    //overriding, because we just changed the implementation
	}
	void m2(int a, int b)   //overloading, because we changed the declaration which is parameter itself
	{
		System.out.println(a+b);
	}
	
	
}

public class OverloadingVsOverriding {

	public static void main(String[] args) 
	{
		ABC ad=new ABC();
		ad.m1(10);
		
		XYZ xy=new XYZ();
		xy.m2(10, 20);
		
		xy.m2(10);
		xy.m1(2);
		

	}

}
