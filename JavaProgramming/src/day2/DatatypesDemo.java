package day2;

public class DatatypesDemo {

	public static void main(String[] args) 
	{
		//Numeric data types
		
		int a=100, b=100,  c=200;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of a is:"+b);
		System.out.println("the value of a is:"+c);
		System.out.println("the sum of value of a and b is:"+" "+(a+b));
		
		byte by=20;
		System.out.println(by);
		
		short sh=12344;
		System.out.println(sh);
		
		long l=234567890L;      // literal is needed for long data type (l or L)
		System.out.println(l);
		
		
		
		//decimal numbers - float, double
		
		float f=12.2345F;       // literal is needed for float data type (f or F)
		System.out.println(f);
		
		double dl=123.34567338;
		System.out.println(dl);

		
		
		
		String name="Sasi";
		System.out.println(name);
		
		char grade='B';   //value should inside the single quote '':(single character)
		System.out.println(grade);
		
		//char ch='ABC'; //invalid
		//String ch='ABC'; //invalid
		//String ch= 'A'   //invalid
		//String ch= "A"   //valid
		
		
		//boolean data type
		
		boolean bl=true;      //allows only true/false
		System.out.println(bl);
		
		boolean cl=false;
		System.out.println(cl);
		
		//boolean bl="true"; //invalid
		
		
		
	}

}
