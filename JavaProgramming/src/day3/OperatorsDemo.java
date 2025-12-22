package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		//1) Arithmetic operators (+, -, *, /, %)
		
		int a=20, b=10;
		int result=(a+b);
		System.out.println(result);
		System.out.println("sum of a and b is"+" "+(a+b));
		System.out.println("Diff of a and b is"+" "+(a-b));
		System.out.println("Multiplication of a and b is"+" "+(a*b));
		System.out.println("Division of a and b is"+" "+(a/b));        //it is shows a cosine value
		System.out.println("modulo devision of a and b is"+" "+(a%b)); //it is shows a reminder value
		
		//2) ﻿﻿﻿Relational/comparison operators: (>, >=, <, <=, !=, ==)
		// these operators are only returns(prints) boolean values - true/false
		
		System.out.println(a>b); //true
		System.out.println(a>=b); //true
		System.out.println(a<b);  //false
		System.out.println(a<=b);  //false
		System.out.println(a!=b); //true    //this operator is not equal to
		System.out.println(a==b);  //false
		b=20;
		System.out.println(a>=b);  //true
		System.out.println(a<=b);   //true
		System.out.println(a!=b);  //false
		System.out.println(a==b);  //true
		
		boolean res=a>b;    //the output is a boolean values so using bolean data type to print the output
		System.out.println(res);
		
		// 3) ﻿﻿﻿Logical operators: (&&(and), ||(or), !(not))
		// always returns (prints) boolean values - true/false
		// works between two boolean values
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y); //false (and)
		System.out.println(x || y); //true    (or)
		System.out.println(!x);     //false   (not)
		System.out.println(!y);     //true 
		
		//using logical and Relational/comparison operators:
		
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=20>10;
        System.out.println(b2);   //true
        
        System.out.println((b1) && (b2)); //false
        System.out.println((b1) || (b2)); //true
        
        System.out.println((10>20) && (20>10)); //false
        System.out.println((10>20) || (20>10)); //true
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
