package day5;

public class WhileLoop {

	public static void main(String[] args) 
	{
		
//Example 1: print 1.......10 numbers
		
		/*int i=1;      //initialization
		
		while(i<=10)  //condition
		{
			System.out.println(i);
			i++;             //incrementation 
		}*/
		
		
//Example:2   print hello message 10 times
		
		/*int i=1;
		
		while (i<=10)
		{
			System.out.println("Hello");
			i++;
		}*/
		
//Example:3  print the even numbers between 1-10
//Approach:1
		
		/*int i=2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}*/
				
//Approach:2
		
		/*int i=1;
		
		while (i<=10)
		{
			
			if (i%2==0)
			{
				System.out.println(i);
			}
				i++;
			}*/
		
//Example:4   print 1-10 numbers, and every number should print even or odd
		
		/*int i=1;
		
		while(i<=10)
		{
			if (i%2==0)
			{
				System.out.println(i+" "+"Even");
			}
			else
			{
				System.out.println(i+" "+"Odd");
			}
			i++;
			}*/
		
//Example:5 print 10-0 numbers in descending order
		
		int i=10;
		
		while (i>=1)
		{
			System.out.println(i);
			i--;
		}
	
		}
	}























