package day2;

public class VariablesDemo 
{

	public static void main(String[] args) //main method
	{
		//int a;      //declaration
		//a=34;       //assignment
		
		/*int a=100;  //declaration & assignment
		System.out.println(a);
		
		a=200;
		System.out.println(a); */
		
		// Approach:1   - if all the variables are belongs to a different data types
		
		/*int a=100;
		int b=200;
		int c=300;*/
		
		//Approach:2   - if all the variables are belongs to the same data type
		
		/*int a,b,c;
		a=100;
		b=200;
		c=300;*/
				
		//Approach:3    - if all the variables are belongs to the same data type
		
		int a=100, b=200, c=300;
		
		System.out.println("the value of a is:"+" "+a); //(+) concatenation operator (if either operand is a String, + combines (concatenates) them into one String.)
		System.out.println("the value of b is:"+" "+b);
		System.out.println("the value of c is:"+" "+c);
		
		System.out.println(a+" "+b+" "+c);
		
	
		

	}

}
